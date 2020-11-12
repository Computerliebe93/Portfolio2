import java.util.Iterator;
import java.util.PriorityQueue;

public class Main<SmallestItems> {

    public static void main(String[] args) {
        AdjacencyListGraph adjGraph = new AdjacencyListGraph();

        Vertex A = new Vertex("Eskildsstrup");
        Vertex B = new Vertex("Haslev");
        Vertex C = new Vertex("Holbæk");
        Vertex D = new Vertex("Jægerspris");
        Vertex E = new Vertex("Kalundborg");
        Vertex F = new Vertex("Korsør");
        Vertex G = new Vertex("Køge");
        Vertex H = new Vertex("Maribo");
        Vertex I = new Vertex("Næstved");
        Vertex J = new Vertex("Ringsted");
        Vertex K = new Vertex("Slagelse");
        Vertex L = new Vertex("Nykøbing F");
        Vertex M = new Vertex("Vordingborg");
        Vertex N = new Vertex("Roskilde");
        Vertex O = new Vertex("sorø");
        Vertex P = new Vertex("Nakskov");

        adjGraph.addVertex(A);
        adjGraph.addVertex(B);
        adjGraph.addVertex(C);
        adjGraph.addVertex(D);
        adjGraph.addVertex(E);
        adjGraph.addVertex(F);
        adjGraph.addVertex(G);
        adjGraph.addVertex(H);
        adjGraph.addVertex(I);
        adjGraph.addVertex(J);
        adjGraph.addVertex(K);
        adjGraph.addVertex(L);
        adjGraph.addVertex(M);
        adjGraph.addVertex(N);
        adjGraph.addVertex(O);
        adjGraph.addVertex(P);


        adjGraph.newEdge(A, H, 28);
        adjGraph.newEdge(A, L, 13);
        adjGraph.newEdge(A, M, 24);
        adjGraph.newEdge(B, F, 60);
        adjGraph.newEdge(B, G, 24);
        adjGraph.newEdge(B, I, 25);
        adjGraph.newEdge(B, J, 19);
        adjGraph.newEdge(B, N, 47);
        adjGraph.newEdge(B, K, 48);
        adjGraph.newEdge(B, O, 34);
        adjGraph.newEdge(B, M, 40);
        adjGraph.newEdge(C, D, 34);
        adjGraph.newEdge(C, E, 44);
        adjGraph.newEdge(C, F, 66);
        adjGraph.newEdge(C, J, 36);
        adjGraph.newEdge(C, N, 32);
        adjGraph.newEdge(C, K, 46);
        adjGraph.newEdge(C, O, 34);
        adjGraph.newEdge(D, F, 95);
        adjGraph.newEdge(D, G, 58);
        adjGraph.newEdge(D, J, 56);
        adjGraph.newEdge(D, N, 33);
        adjGraph.newEdge(D, K, 74);
        adjGraph.newEdge(D, O, 63);
        adjGraph.newEdge(E, J, 62);
        adjGraph.newEdge(E, N, 70);
        adjGraph.newEdge(E, K, 39);
        adjGraph.newEdge(E, O, 51);
        adjGraph.newEdge(F, I, 45);
        adjGraph.newEdge(F, K, 20);
        adjGraph.newEdge(G, I, 45);
        adjGraph.newEdge(G, J, 28);
        adjGraph.newEdge(G, N, 25);
        adjGraph.newEdge(G, M, 60);
        adjGraph.newEdge(H, P, 27);
        adjGraph.newEdge(H, L, 26);
        adjGraph.newEdge(I, N, 57);
        adjGraph.newEdge(I, J, 26);
        adjGraph.newEdge(I, K, 37);
        adjGraph.newEdge(I, O, 32);
        adjGraph.newEdge(I, M, 28);
        adjGraph.newEdge(J, N, 31);
        adjGraph.newEdge(J, O, 15);
        adjGraph.newEdge(J, M, 58);
        adjGraph.newEdge(K, O, 14);

        adjGraph.printGraph();

        int mst = adjGraph.prims();
        adjGraph.PrintMST();
        System.out.println(mst + "Km * 1000000 = " + mst * 1000000);
    }



}

