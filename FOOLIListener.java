// Generated from FOOLI.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link FOOLIParser}.
 */
public interface FOOLIListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(FOOLIParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(FOOLIParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(FOOLIParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(FOOLIParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributeDeclaration(FOOLIParser.AttributeDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributeDeclaration(FOOLIParser.AttributeDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(FOOLIParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(FOOLIParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#parameters}.
	 * @param ctx the parse tree
	 */
	void enterParameters(FOOLIParser.ParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#parameters}.
	 * @param ctx the parse tree
	 */
	void exitParameters(FOOLIParser.ParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(FOOLIParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(FOOLIParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#declarationCommand}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationCommand(FOOLIParser.DeclarationCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#declarationCommand}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationCommand(FOOLIParser.DeclarationCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(FOOLIParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(FOOLIParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(FOOLIParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(FOOLIParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(FOOLIParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(FOOLIParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void enterWhileLoop(FOOLIParser.WhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#whileLoop}.
	 * @param ctx the parse tree
	 */
	void exitWhileLoop(FOOLIParser.WhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(FOOLIParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(FOOLIParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void enterMethodCall(FOOLIParser.MethodCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#methodCall}.
	 * @param ctx the parse tree
	 */
	void exitMethodCall(FOOLIParser.MethodCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#arguments}.
	 * @param ctx the parse tree
	 */
	void enterArguments(FOOLIParser.ArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#arguments}.
	 * @param ctx the parse tree
	 */
	void exitArguments(FOOLIParser.ArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(FOOLIParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(FOOLIParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticExpression(FOOLIParser.ArithmeticExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticExpression(FOOLIParser.ArithmeticExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(FOOLIParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(FOOLIParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(FOOLIParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(FOOLIParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(FOOLIParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(FOOLIParser.PrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterBooleanExpression(FOOLIParser.BooleanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitBooleanExpression(FOOLIParser.BooleanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(FOOLIParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#logicalExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(FOOLIParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalExpression(FOOLIParser.RelationalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#relationalExpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalExpression(FOOLIParser.RelationalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link FOOLIParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(FOOLIParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link FOOLIParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(FOOLIParser.TypeContext ctx);
}