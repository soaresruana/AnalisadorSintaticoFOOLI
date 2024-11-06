// Generated from FOOLI.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link FOOLIParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface FOOLIVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(FOOLIParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(FOOLIParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#attributeDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeDeclaration(FOOLIParser.AttributeDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(FOOLIParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameters(FOOLIParser.ParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(FOOLIParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#declarationCommand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationCommand(FOOLIParser.DeclarationCommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(FOOLIParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(FOOLIParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(FOOLIParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#whileLoop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileLoop(FOOLIParser.WhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(FOOLIParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(FOOLIParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(FOOLIParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(FOOLIParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#arithmeticExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticExpression(FOOLIParser.ArithmeticExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(FOOLIParser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(FOOLIParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimary(FOOLIParser.PrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanExpression(FOOLIParser.BooleanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#logicalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(FOOLIParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#relationalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationalExpression(FOOLIParser.RelationalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link FOOLIParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(FOOLIParser.TypeContext ctx);
}