package aed.individual6;

import es.upm.aedlib.graph.DirectedGraph;
import es.upm.aedlib.graph.Edge;
import es.upm.aedlib.graph.Vertex;
import es.upm.aedlib.map.HashTableMap;
import es.upm.aedlib.map.Map;

import java.util.HashSet;
import java.util.Set;

public class Suma {
    public static <E> Map<Vertex<Integer>, Integer> sumVertices(DirectedGraph<Integer, E> g) {
    	
        Map<Vertex<Integer>, Integer> map = new HashTableMap<Vertex<Integer>, Integer>();
        System.out.println(g);
        
        for (Vertex<Integer> vertex : g.vertices())
            map.put(vertex, sumaVertices(g, vertex, new HashSet<Vertex<Integer>>()));
        System.out.println(map + "\n");
        return map;
        
    }
    

    private static <E> int sumaVertices(DirectedGraph<Integer, E> g, Vertex<Integer> actual, Set<Vertex<Integer>> contados) {
        if (contados.contains(actual))
            return 0;

        contados.add(actual);
        int map = actual.element();
        for (Edge<E> edge : g.outgoingEdges(actual))
            map += sumaVertices(g, g.endVertex(edge), contados);
        return map;
    }
    
}