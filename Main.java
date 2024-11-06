// Autor: Ruana Soares - Compiladores

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Cria o lexer e o parser
        CharStream input = CharStreams.fromFileName("programa.fool");
        FOOLILexer lexer = new FOOLILexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        FOOLIParser parser = new FOOLIParser(tokens);

        // Parse o programa
        ParseTree tree = parser.program();

        // Imprima a árvore de sintaxe no formato DOT
        System.out.println(tree.toStringTree(parser));  

        // Geração do arquivo DOT válido para o Graphviz
        String dotRepresentation = generateDot(tree);

        // SalvA a saída DOT em um arquivo
        try (PrintWriter writer = new PrintWriter("tree.dot", "UTF-8")) {
            writer.println(dotRepresentation);
        } catch (FileNotFoundException | UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    // Função para gerar a representação DOT da árvore
    public static String generateDot(ParseTree tree) {
        StringBuilder dot = new StringBuilder();
        dot.append("digraph G {\n");

        // Chama a função recursiva para construir o DOT a partir da árvore
        generateDotRecursive(tree, dot, 0);

        dot.append("}\n");
        return dot.toString();
    }

    // Função recursiva para gerar o conteúdo DOT
    private static void generateDotRecursive(ParseTree tree, StringBuilder dot, int nodeId) {
        if (tree == null) return;

        // Cria um ID único para o nó
        int currentNodeId = nodeId++;
        String nodeLabel = tree.getText().replaceAll("\"", "\\\"");  // Escapa as aspas no texto

        // Adiciona o nó no formato DOT
        dot.append("    node" + currentNodeId + " [label=\"" + nodeLabel + "\"];\n");

        // Se o nó tiver filhos, cria as arestas entre eles
        for (int i = 0; i < tree.getChildCount(); i++) {
            int childNodeId = nodeId++;
            dot.append("    node" + currentNodeId + " -> node" + childNodeId + ";\n");
            generateDotRecursive(tree.getChild(i), dot, nodeId);
        }
    }
}
