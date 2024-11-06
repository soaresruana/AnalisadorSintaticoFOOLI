//Autor: Ruana Boeira Soares - Compiladores

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;
import java.util.ArrayList;
import java.util.List;

public class TACGenerator extends FOOLIBaseVisitor<String> {
    private int tempVarCount = 1;
    private List<String> tac = new ArrayList<>();

    public List<String> getTac() {
        return tac;
    }

    private String generateTempVar() {
        return "t" + (tempVarCount++);
    }

    @Override
    public String visitAssignment(FOOLIParser.AssignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        String exprResult = visit(ctx.expression());
        tac.add(varName + " = " + exprResult);
        return null;
    }

    @Override
    public String visitExpression(FOOLIParser.ExpressionContext ctx) {
        String result = visit(ctx.arithmeticExpression().term(0));
        for (int i = 1; i < ctx.arithmeticExpression().term().size(); i++) {
            String op = ctx.arithmeticExpression().getChild(2 * i - 1).getText();
            String term = visit(ctx.arithmeticExpression().term(i));
            String tempVar = generateTempVar();
            tac.add(tempVar + " = " + result + " " + op + " " + term);
            result = tempVar;
        }
        return result;
    }

    @Override
    public String visitTerm(FOOLIParser.TermContext ctx) {
        String result = visit(ctx.factor(0));
        for (int i = 1; i < ctx.factor().size(); i++) {
            String op = ctx.getChild(2 * i - 1).getText();
            String factor = visit(ctx.factor(i));
            String tempVar = generateTempVar();
            tac.add(tempVar + " = " + result + " " + op + " " + factor);
            result = tempVar;
        }
        return result;
    }

    @Override
    public String visitFactor(FOOLIParser.FactorContext ctx) {
        if (ctx.primary().NUMBER() != null) {
            return ctx.primary().NUMBER().getText();
        } else if (ctx.primary().IDENTIFIER() != null) {
            return ctx.primary().IDENTIFIER().getText();
        } else {
            return visit(ctx.arithmeticExpression());
        }
    }
}
