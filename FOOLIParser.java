// Generated from FOOLI.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class FOOLIParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, IDENTIFIER=26, NUMBER=27, BOOLEAN=28, WS=29;
	public static final int
		RULE_program = 0, RULE_classDeclaration = 1, RULE_attributeDeclaration = 2, 
		RULE_methodDeclaration = 3, RULE_parameters = 4, RULE_parameter = 5, RULE_declarationCommand = 6, 
		RULE_command = 7, RULE_assignment = 8, RULE_ifStatement = 9, RULE_whileLoop = 10, 
		RULE_returnStatement = 11, RULE_methodCall = 12, RULE_arguments = 13, 
		RULE_expression = 14, RULE_arithmeticExpression = 15, RULE_term = 16, 
		RULE_factor = 17, RULE_primary = 18, RULE_booleanExpression = 19, RULE_logicalExpression = 20, 
		RULE_relationalExpression = 21, RULE_type = 22;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "classDeclaration", "attributeDeclaration", "methodDeclaration", 
			"parameters", "parameter", "declarationCommand", "command", "assignment", 
			"ifStatement", "whileLoop", "returnStatement", "methodCall", "arguments", 
			"expression", "arithmeticExpression", "term", "factor", "primary", "booleanExpression", 
			"logicalExpression", "relationalExpression", "type"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'{'", "'}'", "'='", "';'", "'('", "')'", "','", "'if'", 
			"'else'", "'while'", "'return'", "'+'", "'-'", "'*'", "'/'", "'not'", 
			"'and'", "'or'", "'=='", "'<'", "'>'", "'int'", "'bool'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "NUMBER", "BOOLEAN", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "FOOLI.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public FOOLIParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public ClassDeclarationContext classDeclaration() {
			return getRuleContext(ClassDeclarationContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			classDeclaration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public List<AttributeDeclarationContext> attributeDeclaration() {
			return getRuleContexts(AttributeDeclarationContext.class);
		}
		public AttributeDeclarationContext attributeDeclaration(int i) {
			return getRuleContext(AttributeDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterClassDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitClassDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__0);
			setState(49);
			match(IDENTIFIER);
			setState(50);
			match(T__1);
			setState(55);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(51);
					attributeDeclaration();
					}
					break;
				case 2:
					{
					setState(52);
					methodDeclaration();
					}
					break;
				}
				}
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(58);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AttributeDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AttributeDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterAttributeDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitAttributeDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitAttributeDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeDeclarationContext attributeDeclaration() throws RecognitionException {
		AttributeDeclarationContext _localctx = new AttributeDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_attributeDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			type();
			setState(61);
			match(IDENTIFIER);
			setState(64);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(62);
				match(T__3);
				setState(63);
				expression();
				}
			}

			setState(66);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodDeclarationContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ParametersContext parameters() {
			return getRuleContext(ParametersContext.class,0);
		}
		public List<DeclarationCommandContext> declarationCommand() {
			return getRuleContexts(DeclarationCommandContext.class);
		}
		public DeclarationCommandContext declarationCommand(int i) {
			return getRuleContext(DeclarationCommandContext.class,i);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterMethodDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitMethodDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitMethodDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_methodDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			type();
			setState(69);
			match(IDENTIFIER);
			setState(70);
			match(T__5);
			setState(72);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) {
				{
				setState(71);
				parameters();
				}
			}

			setState(74);
			match(T__6);
			setState(75);
			match(T__1);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 125835776L) != 0)) {
				{
				setState(78);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__22:
				case T__23:
				case T__24:
					{
					setState(76);
					declarationCommand();
					}
					break;
				case T__8:
				case T__10:
				case T__11:
				case IDENTIFIER:
					{
					setState(77);
					command();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(82);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(83);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParametersContext extends ParserRuleContext {
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public ParametersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterParameters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitParameters(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitParameters(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametersContext parameters() throws RecognitionException {
		ParametersContext _localctx = new ParametersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parameters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			parameter();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(86);
				match(T__7);
				setState(87);
				parameter();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_parameter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			type();
			setState(94);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationCommandContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DeclarationCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declarationCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterDeclarationCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitDeclarationCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitDeclarationCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationCommandContext declarationCommand() throws RecognitionException {
		DeclarationCommandContext _localctx = new DeclarationCommandContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declarationCommand);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			type();
			setState(97);
			match(IDENTIFIER);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(98);
				match(T__3);
				setState(99);
				expression();
				}
			}

			setState(102);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_command);
		int _la;
		try {
			setState(112);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				ifStatement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(106);
				whileLoop();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(107);
				returnStatement();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(108);
				methodCall();
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(109);
					match(T__4);
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(IDENTIFIER);
			setState(115);
			match(T__3);
			setState(116);
			expression();
			setState(117);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfStatementContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitIfStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitIfStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__8);
			setState(120);
			match(T__5);
			setState(121);
			booleanExpression();
			setState(122);
			match(T__6);
			setState(123);
			match(T__1);
			setState(124);
			command();
			setState(125);
			match(T__2);
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(126);
				match(T__9);
				setState(127);
				match(T__1);
				setState(128);
				command();
				setState(129);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhileLoopContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(T__10);
			setState(134);
			match(T__5);
			setState(135);
			booleanExpression();
			setState(136);
			match(T__6);
			setState(137);
			match(T__1);
			setState(138);
			command();
			setState(139);
			match(T__2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(T__11);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 201457728L) != 0)) {
				{
				setState(142);
				expression();
				}
			}

			setState(145);
			match(T__4);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterMethodCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitMethodCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(T__5);
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 201457728L) != 0)) {
				{
				setState(149);
				arguments();
				}
			}

			setState(152);
			match(T__6);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			expression();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(155);
				match(T__7);
				setState(156);
				expression();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				arithmeticExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				booleanExpression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArithmeticExpressionContext extends ParserRuleContext {
		public List<TermContext> term() {
			return getRuleContexts(TermContext.class);
		}
		public TermContext term(int i) {
			return getRuleContext(TermContext.class,i);
		}
		public ArithmeticExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterArithmeticExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitArithmeticExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitArithmeticExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticExpressionContext arithmeticExpression() throws RecognitionException {
		ArithmeticExpressionContext _localctx = new ArithmeticExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_arithmeticExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			term();
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__12 || _la==T__13) {
				{
				{
				setState(167);
				_la = _input.LA(1);
				if ( !(_la==T__12 || _la==T__13) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(168);
				term();
				}
				}
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TermContext extends ParserRuleContext {
		public List<FactorContext> factor() {
			return getRuleContexts(FactorContext.class);
		}
		public FactorContext factor(int i) {
			return getRuleContext(FactorContext.class,i);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitTerm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitTerm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_term);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			factor();
			setState(179);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__14 || _la==T__15) {
				{
				{
				setState(175);
				_la = _input.LA(1);
				if ( !(_la==T__14 || _la==T__15) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(176);
				factor();
				}
				}
				setState(181);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FactorContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ArithmeticExpressionContext arithmeticExpression() {
			return getRuleContext(ArithmeticExpressionContext.class,0);
		}
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterFactor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitFactor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitFactor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_factor);
		try {
			setState(188);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				primary();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(183);
				methodCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(184);
				match(T__5);
				setState(185);
				arithmeticExpression();
				setState(186);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(FOOLIParser.IDENTIFIER, 0); }
		public TerminalNode NUMBER() { return getToken(FOOLIParser.NUMBER, 0); }
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_primary);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_la = _input.LA(1);
			if ( !(_la==IDENTIFIER || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanExpressionContext extends ParserRuleContext {
		public LogicalExpressionContext logicalExpression() {
			return getRuleContext(LogicalExpressionContext.class,0);
		}
		public RelationalExpressionContext relationalExpression() {
			return getRuleContext(RelationalExpressionContext.class,0);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterBooleanExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitBooleanExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitBooleanExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_booleanExpression);
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				logicalExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				relationalExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				match(T__5);
				setState(195);
				booleanExpression();
				setState(196);
				match(T__6);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogicalExpressionContext extends ParserRuleContext {
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public List<LogicalExpressionContext> logicalExpression() {
			return getRuleContexts(LogicalExpressionContext.class);
		}
		public LogicalExpressionContext logicalExpression(int i) {
			return getRuleContext(LogicalExpressionContext.class,i);
		}
		public LogicalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterLogicalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitLogicalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitLogicalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicalExpressionContext logicalExpression() throws RecognitionException {
		return logicalExpression(0);
	}

	private LogicalExpressionContext logicalExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		LogicalExpressionContext _localctx = new LogicalExpressionContext(_ctx, _parentState);
		LogicalExpressionContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_logicalExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFIER:
			case NUMBER:
				{
				setState(201);
				primary();
				}
				break;
			case T__16:
				{
				setState(202);
				match(T__16);
				setState(203);
				logicalExpression(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new LogicalExpressionContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_logicalExpression);
					setState(206);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(207);
					_la = _input.LA(1);
					if ( !(_la==T__17 || _la==T__18) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(208);
					logicalExpression(2);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RelationalExpressionContext extends ParserRuleContext {
		public List<ArithmeticExpressionContext> arithmeticExpression() {
			return getRuleContexts(ArithmeticExpressionContext.class);
		}
		public ArithmeticExpressionContext arithmeticExpression(int i) {
			return getRuleContext(ArithmeticExpressionContext.class,i);
		}
		public RelationalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterRelationalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitRelationalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitRelationalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationalExpressionContext relationalExpression() throws RecognitionException {
		RelationalExpressionContext _localctx = new RelationalExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_relationalExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			arithmeticExpression();
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) {
				{
				{
				setState(215);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 7340032L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(216);
				arithmeticExpression();
				}
				}
				setState(221);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeContext extends ParserRuleContext {
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof FOOLIListener ) ((FOOLIListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof FOOLIVisitor ) return ((FOOLIVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 58720256L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 20:
			return logicalExpression_sempred((LogicalExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean logicalExpression_sempred(LogicalExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001d\u00e1\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u00016\b\u0001\n\u0001"+
		"\f\u00019\t\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002A\b\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003I\b\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003O\b\u0003\n\u0003"+
		"\f\u0003R\t\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0005\u0004Y\b\u0004\n\u0004\f\u0004\\\t\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003"+
		"\u0006e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007o\b\u0007\u0003"+
		"\u0007q\b\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0084\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0003\u000b\u0090\b\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u0097\b\f\u0001\f\u0001"+
		"\f\u0001\r\u0001\r\u0001\r\u0005\r\u009e\b\r\n\r\f\r\u00a1\t\r\u0001\u000e"+
		"\u0001\u000e\u0003\u000e\u00a5\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u00aa\b\u000f\n\u000f\f\u000f\u00ad\t\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u00b2\b\u0010\n\u0010\f\u0010\u00b5\t\u0010"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0003\u0011\u00bd\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u00c7\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u00cd\b\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u00d2\b\u0014\n\u0014"+
		"\f\u0014\u00d5\t\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015"+
		"\u00da\b\u0015\n\u0015\f\u0015\u00dd\t\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0000\u0001(\u0017\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012"+
		"\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,\u0000\u0006\u0001\u0000\r"+
		"\u000e\u0001\u0000\u000f\u0010\u0001\u0000\u001a\u001b\u0001\u0000\u0012"+
		"\u0013\u0001\u0000\u0014\u0016\u0001\u0000\u0017\u0019\u00e4\u0000.\u0001"+
		"\u0000\u0000\u0000\u00020\u0001\u0000\u0000\u0000\u0004<\u0001\u0000\u0000"+
		"\u0000\u0006D\u0001\u0000\u0000\u0000\bU\u0001\u0000\u0000\u0000\n]\u0001"+
		"\u0000\u0000\u0000\f`\u0001\u0000\u0000\u0000\u000ep\u0001\u0000\u0000"+
		"\u0000\u0010r\u0001\u0000\u0000\u0000\u0012w\u0001\u0000\u0000\u0000\u0014"+
		"\u0085\u0001\u0000\u0000\u0000\u0016\u008d\u0001\u0000\u0000\u0000\u0018"+
		"\u0093\u0001\u0000\u0000\u0000\u001a\u009a\u0001\u0000\u0000\u0000\u001c"+
		"\u00a4\u0001\u0000\u0000\u0000\u001e\u00a6\u0001\u0000\u0000\u0000 \u00ae"+
		"\u0001\u0000\u0000\u0000\"\u00bc\u0001\u0000\u0000\u0000$\u00be\u0001"+
		"\u0000\u0000\u0000&\u00c6\u0001\u0000\u0000\u0000(\u00cc\u0001\u0000\u0000"+
		"\u0000*\u00d6\u0001\u0000\u0000\u0000,\u00de\u0001\u0000\u0000\u0000."+
		"/\u0003\u0002\u0001\u0000/\u0001\u0001\u0000\u0000\u000001\u0005\u0001"+
		"\u0000\u000012\u0005\u001a\u0000\u000027\u0005\u0002\u0000\u000036\u0003"+
		"\u0004\u0002\u000046\u0003\u0006\u0003\u000053\u0001\u0000\u0000\u0000"+
		"54\u0001\u0000\u0000\u000069\u0001\u0000\u0000\u000075\u0001\u0000\u0000"+
		"\u000078\u0001\u0000\u0000\u00008:\u0001\u0000\u0000\u000097\u0001\u0000"+
		"\u0000\u0000:;\u0005\u0003\u0000\u0000;\u0003\u0001\u0000\u0000\u0000"+
		"<=\u0003,\u0016\u0000=@\u0005\u001a\u0000\u0000>?\u0005\u0004\u0000\u0000"+
		"?A\u0003\u001c\u000e\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000"+
		"\u0000AB\u0001\u0000\u0000\u0000BC\u0005\u0005\u0000\u0000C\u0005\u0001"+
		"\u0000\u0000\u0000DE\u0003,\u0016\u0000EF\u0005\u001a\u0000\u0000FH\u0005"+
		"\u0006\u0000\u0000GI\u0003\b\u0004\u0000HG\u0001\u0000\u0000\u0000HI\u0001"+
		"\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JK\u0005\u0007\u0000\u0000"+
		"KP\u0005\u0002\u0000\u0000LO\u0003\f\u0006\u0000MO\u0003\u000e\u0007\u0000"+
		"NL\u0001\u0000\u0000\u0000NM\u0001\u0000\u0000\u0000OR\u0001\u0000\u0000"+
		"\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000QS\u0001\u0000"+
		"\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u0005\u0003\u0000\u0000T\u0007"+
		"\u0001\u0000\u0000\u0000UZ\u0003\n\u0005\u0000VW\u0005\b\u0000\u0000W"+
		"Y\u0003\n\u0005\u0000XV\u0001\u0000\u0000\u0000Y\\\u0001\u0000\u0000\u0000"+
		"ZX\u0001\u0000\u0000\u0000Z[\u0001\u0000\u0000\u0000[\t\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]^\u0003,\u0016\u0000^_\u0005\u001a\u0000"+
		"\u0000_\u000b\u0001\u0000\u0000\u0000`a\u0003,\u0016\u0000ad\u0005\u001a"+
		"\u0000\u0000bc\u0005\u0004\u0000\u0000ce\u0003\u001c\u000e\u0000db\u0001"+
		"\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000"+
		"fg\u0005\u0005\u0000\u0000g\r\u0001\u0000\u0000\u0000hq\u0003\u0010\b"+
		"\u0000iq\u0003\u0012\t\u0000jq\u0003\u0014\n\u0000kq\u0003\u0016\u000b"+
		"\u0000ln\u0003\u0018\f\u0000mo\u0005\u0005\u0000\u0000nm\u0001\u0000\u0000"+
		"\u0000no\u0001\u0000\u0000\u0000oq\u0001\u0000\u0000\u0000ph\u0001\u0000"+
		"\u0000\u0000pi\u0001\u0000\u0000\u0000pj\u0001\u0000\u0000\u0000pk\u0001"+
		"\u0000\u0000\u0000pl\u0001\u0000\u0000\u0000q\u000f\u0001\u0000\u0000"+
		"\u0000rs\u0005\u001a\u0000\u0000st\u0005\u0004\u0000\u0000tu\u0003\u001c"+
		"\u000e\u0000uv\u0005\u0005\u0000\u0000v\u0011\u0001\u0000\u0000\u0000"+
		"wx\u0005\t\u0000\u0000xy\u0005\u0006\u0000\u0000yz\u0003&\u0013\u0000"+
		"z{\u0005\u0007\u0000\u0000{|\u0005\u0002\u0000\u0000|}\u0003\u000e\u0007"+
		"\u0000}\u0083\u0005\u0003\u0000\u0000~\u007f\u0005\n\u0000\u0000\u007f"+
		"\u0080\u0005\u0002\u0000\u0000\u0080\u0081\u0003\u000e\u0007\u0000\u0081"+
		"\u0082\u0005\u0003\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083"+
		"~\u0001\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0013"+
		"\u0001\u0000\u0000\u0000\u0085\u0086\u0005\u000b\u0000\u0000\u0086\u0087"+
		"\u0005\u0006\u0000\u0000\u0087\u0088\u0003&\u0013\u0000\u0088\u0089\u0005"+
		"\u0007\u0000\u0000\u0089\u008a\u0005\u0002\u0000\u0000\u008a\u008b\u0003"+
		"\u000e\u0007\u0000\u008b\u008c\u0005\u0003\u0000\u0000\u008c\u0015\u0001"+
		"\u0000\u0000\u0000\u008d\u008f\u0005\f\u0000\u0000\u008e\u0090\u0003\u001c"+
		"\u000e\u0000\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000"+
		"\u0000\u0000\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0092\u0005\u0005"+
		"\u0000\u0000\u0092\u0017\u0001\u0000\u0000\u0000\u0093\u0094\u0005\u001a"+
		"\u0000\u0000\u0094\u0096\u0005\u0006\u0000\u0000\u0095\u0097\u0003\u001a"+
		"\r\u0000\u0096\u0095\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000"+
		"\u0000\u0097\u0098\u0001\u0000\u0000\u0000\u0098\u0099\u0005\u0007\u0000"+
		"\u0000\u0099\u0019\u0001\u0000\u0000\u0000\u009a\u009f\u0003\u001c\u000e"+
		"\u0000\u009b\u009c\u0005\b\u0000\u0000\u009c\u009e\u0003\u001c\u000e\u0000"+
		"\u009d\u009b\u0001\u0000\u0000\u0000\u009e\u00a1\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a0\u001b\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a5\u0003\u001e\u000f\u0000\u00a3\u00a5\u0003&\u0013\u0000\u00a4"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5"+
		"\u001d\u0001\u0000\u0000\u0000\u00a6\u00ab\u0003 \u0010\u0000\u00a7\u00a8"+
		"\u0007\u0000\u0000\u0000\u00a8\u00aa\u0003 \u0010\u0000\u00a9\u00a7\u0001"+
		"\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001"+
		"\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u001f\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae\u00b3\u0003"+
		"\"\u0011\u0000\u00af\u00b0\u0007\u0001\u0000\u0000\u00b0\u00b2\u0003\""+
		"\u0011\u0000\u00b1\u00af\u0001\u0000\u0000\u0000\u00b2\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4!\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000\u0000"+
		"\u0000\u00b6\u00bd\u0003$\u0012\u0000\u00b7\u00bd\u0003\u0018\f\u0000"+
		"\u00b8\u00b9\u0005\u0006\u0000\u0000\u00b9\u00ba\u0003\u001e\u000f\u0000"+
		"\u00ba\u00bb\u0005\u0007\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc\u00b7\u0001\u0000\u0000\u0000"+
		"\u00bc\u00b8\u0001\u0000\u0000\u0000\u00bd#\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0007\u0002\u0000\u0000\u00bf%\u0001\u0000\u0000\u0000\u00c0\u00c7"+
		"\u0003(\u0014\u0000\u00c1\u00c7\u0003*\u0015\u0000\u00c2\u00c3\u0005\u0006"+
		"\u0000\u0000\u00c3\u00c4\u0003&\u0013\u0000\u00c4\u00c5\u0005\u0007\u0000"+
		"\u0000\u00c5\u00c7\u0001\u0000\u0000\u0000\u00c6\u00c0\u0001\u0000\u0000"+
		"\u0000\u00c6\u00c1\u0001\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000"+
		"\u0000\u00c7\'\u0001\u0000\u0000\u0000\u00c8\u00c9\u0006\u0014\uffff\uffff"+
		"\u0000\u00c9\u00cd\u0003$\u0012\u0000\u00ca\u00cb\u0005\u0011\u0000\u0000"+
		"\u00cb\u00cd\u0003(\u0014\u0002\u00cc\u00c8\u0001\u0000\u0000\u0000\u00cc"+
		"\u00ca\u0001\u0000\u0000\u0000\u00cd\u00d3\u0001\u0000\u0000\u0000\u00ce"+
		"\u00cf\n\u0001\u0000\u0000\u00cf\u00d0\u0007\u0003\u0000\u0000\u00d0\u00d2"+
		"\u0003(\u0014\u0002\u00d1\u00ce\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001"+
		"\u0000\u0000\u0000\u00d4)\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000"+
		"\u0000\u0000\u00d6\u00db\u0003\u001e\u000f\u0000\u00d7\u00d8\u0007\u0004"+
		"\u0000\u0000\u00d8\u00da\u0003\u001e\u000f\u0000\u00d9\u00d7\u0001\u0000"+
		"\u0000\u0000\u00da\u00dd\u0001\u0000\u0000\u0000\u00db\u00d9\u0001\u0000"+
		"\u0000\u0000\u00db\u00dc\u0001\u0000\u0000\u0000\u00dc+\u0001\u0000\u0000"+
		"\u0000\u00dd\u00db\u0001\u0000\u0000\u0000\u00de\u00df\u0007\u0005\u0000"+
		"\u0000\u00df-\u0001\u0000\u0000\u0000\u001657@HNPZdnp\u0083\u008f\u0096"+
		"\u009f\u00a4\u00ab\u00b3\u00bc\u00c6\u00cc\u00d3\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}