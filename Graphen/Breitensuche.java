package Graphen;

class Breitensuche {
    Graph graph;

    Breitensuche(){
        graph = new Map().getGraph();
    }

    public void breitensuche(Vertex k){
        List<Vertex> vertices = graph.getVertices();
        vertices.toFirst();
        while(vertices.hasAccess()){
            vertices.getContent().setMark(false);
            vertices.next();
        }
        graph.getVertex(k.getID()).setMark(true);
        System.out.println(k.getID());
        List<Vertex> s = new List<>();
        s.append(k);
        s.toFirst();
        while(!s.isEmpty()){
            s.toFirst();
            Vertex akt = s.getContent();
            s.remove();
            List<Vertex> nachbarn = graph.getNeighbours(graph.getVertex(akt.getID()));
            nachbarn.toFirst();
            while(nachbarn.hasAccess()){
                Vertex n = nachbarn.getContent();
                if(!n.isMarked()){
                    graph.getVertex(n.getID()).setMark(true);
                    System.out.println(n.getID());
                    s.append(n);
                }
                nachbarn.next();
            }
        }
    }

}