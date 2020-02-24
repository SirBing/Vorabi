package Graphen;

class Map {
    Graph graph;
    Map(){
        graph = new Graph();
        Vertex eins = new Vertex("1");
        Vertex zwei = new Vertex("2");
        Vertex drei = new Vertex("3");
        Vertex vier = new Vertex("4");
        Vertex fuenf = new Vertex("5");
        Vertex sechs = new Vertex("6");
        Vertex sieben = new Vertex("7");
        Vertex acht = new Vertex("8");

        graph.addVertex(eins);
        graph.addVertex(zwei);
        graph.addVertex(drei);
        graph.addVertex(vier);
        graph.addVertex(fuenf);
        graph.addVertex(sechs);
        graph.addVertex(sieben);
        graph.addVertex(acht);
        graph.addEdge(new Edge(eins, fuenf, 1));
        graph.addEdge(new Edge(eins, vier, 1));
        graph.addEdge(new Edge(eins, sechs, 1));
        graph.addEdge(new Edge(fuenf, acht, 1));
        graph.addEdge(new Edge(fuenf, vier, 1));
        graph.addEdge(new Edge(vier, drei, 1));
        graph.addEdge(new Edge(vier, sieben, 1));
        graph.addEdge(new Edge(sieben, zwei, 1));
        graph.addEdge(new Edge(zwei, drei, 1));
        graph.addEdge(new Edge(zwei, sechs, 1));
        graph.addEdge(new Edge(zwei, vier, 1));
        graph.addEdge(new Edge(drei, sechs, 1));
    }

    public Graph getGraph(){
        return graph;
    }

}