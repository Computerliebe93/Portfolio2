import java.util.*;

public class AdjacencyListGraph {
    private ArrayList<Vertex> vertices;

    // Adjacency list graph
    public AdjacencyListGraph(){
        vertices = new ArrayList<>();
    }
    public void addVertex(Vertex v){
        vertices.add(v);
    }
    public Integer newEdge(Vertex from, Vertex to, Integer dist){
        if (! (vertices.contains(from) && vertices.contains(to)))
        {
            System.out.println("Vertex not found");
            return null;
        }
        Edge newEdge = new Edge(from, to, dist);
        Edge newEdge2 = new Edge(to, from, dist);

        return null;
    }

    // Print grpah method
    public void printGraph(){
        Vertex currentV;
        for (int i = 0; i < vertices.size(); i++){
            currentV = vertices.get(i);
            System.out.println("Edges from Vertex: " + currentV.getName());
            for (int j= 0; j < currentV.getOutEdges().size(); j++)
            {
                Edge currentE = currentV.getOutEdges().get(j);
                System.out.println("To " + currentE.getToVertex().getName() + " weight " + currentE.getWeight());
            }
            System.out.println(" ");
        }
    }

    // Print minimum spanning tree method
    public void PrintMST(){
        for (int i = 0; i < vertices.size(); i++){
            if (vertices.get(i).pred != null)
                System.out.println(vertices.get(i).pred.getName() + " parent "
                        + vertices.get(i).getName() + " Edge weight " + vertices.get(i).distance);
        }
        System.out.println();
    }

    // Prims algorithm method
    public int prims (){
        PriorityQueue<Vertex> Q = new PriorityQueue<Vertex>();
        if (vertices.size() > 0) {
            vertices.get(0).distance = 0;
            Q.offer(vertices.get(0));
        }
        int counter = 0;
        int mst = 0;
        while (!Q.isEmpty() && counter < vertices.size()) {
            Vertex i = Q.poll();
            for (int J = 0; J < i.getOutEdges().size(); J++) {
                if (!i.getOutEdges().get(J).getToVertex().visited) {
                    if (i.getOutEdges().get(J).getWeight() < i.getOutEdges().get(J).getToVertex().distance) {
                        i.getOutEdges().get(J).getToVertex().distance = i.getOutEdges().get(J).getWeight();
                        i.getOutEdges().get(J).getToVertex().pred = i;
                        Q.offer(i.getOutEdges().get(J).getToVertex());
                    }
                }
            }
            counter++;
            i.visited = true;
            mst += i.distance;
        }
        return mst;
    }
    private static void SmallestItems() {
        Queue<Integer> smallestPQ = new PriorityQueue<Integer>();
        smallestPQ.add(2);
        smallestPQ.add(5);
        smallestPQ.add(1);
    }
}

// Vertex class with getters for vertices
class Vertex implements Comparable<Vertex>{
    private String Name;
    private ArrayList<Edge> outEdges;
    Vertex pred = null;
    boolean visited = false;
    Integer distance = Integer.MAX_VALUE;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public ArrayList<Edge> getOutEdges() {
        return outEdges;
    }

    public void setOutEdges(ArrayList<Edge> outEdges) {
        this.outEdges = outEdges;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Vertex(String id)
    {
        this.Name = id;
        outEdges = new ArrayList<>();
    }
    public void addOutEdge(Edge outEdge){
        outEdges.add(outEdge);
    }

    @Override
    public int compareTo(Vertex o) {
        if (this.distance < o.distance)
            return -1;
        if (this.distance > o.distance)
            return 1;

        return 0;
    }
}

// Edge class with getters for edges
class Edge {
    private Vertex fromVertex;
    private Vertex toVertex;

    public Vertex getFromVertex() {
        return fromVertex;
    }

    public void setFromVertex(Vertex fromVertex) {
        this.fromVertex = fromVertex;
    }

    public Vertex getToVertex() {
        return toVertex;
    }

    public void setToVertex(Vertex toVertex) {
        this.toVertex = toVertex;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    private Integer weight;

    public Edge(Vertex from, Vertex to, Integer cost) {
        fromVertex = from;
        toVertex = to;
        weight = cost;
        from.addOutEdge(this);
    }
}