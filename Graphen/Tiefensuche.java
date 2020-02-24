package Graphen;

class Tiefensuche {
    Graph graph;
    public Tiefensuche(){
        graph = new Map().getGraph();
    }

    public void besuche(Vertex k){
        System.out.println(k.getID());
        graph.getVertex(k.getID()).setMark(true);
        List<Vertex> nachbarn = graph.getNeighbours(graph.getVertex(k.getID()));
        nachbarn.toFirst();
        while(nachbarn.hasAccess()){
            Vertex n = nachbarn.getContent();
            if(!n.isMarked()){
                besuche(n);
            } 
            nachbarn.next();
        }
    }

    public void besuchePrio(Vertex k){
        System.out.println(k.getID());
        graph.getVertex(k.getID()).setMark(true);
        List<Vertex> nachbarn = graph.getNeighbours(graph.getVertex(k.getID()));
        //Nachbarn nach Größe sortieren
        nachbarn.toFirst();
        Vertex temp = nachbarn.getContent();
        while(nachbarn.hasAccess()){
            Vertex next = nachbarn.getContent();
            if(Integer.parseInt(next.getID()) < Integer.parseInt(temp.getID())){
                
            }
        }
        nachbarn.toFirst();
        while(nachbarn.hasAccess()){
            Vertex n = nachbarn.getContent();
            if(!n.isMarked()){
                besuche(n);
            } 
            nachbarn.next();
        }
    }

}