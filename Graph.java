import java.util.*;

class Graph {
    private Map<String, List<String>> adjList = new HashMap<>();

    public void addLocation(String location) {
        adjList.putIfAbsent(location, new ArrayList<>());
    }

    public void addRoad(String src, String dest) {
        if (adjList.containsKey(src) && adjList.containsKey(dest)) {
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
    }

    public void removeRoad(String src, String dest) {
        if (adjList.containsKey(src)) adjList.get(src).remove(dest);
        if (adjList.containsKey(dest)) adjList.get(dest).remove(src);
    }

    public void removeLocation(String location) {
        adjList.values().forEach(list -> list.remove(location));
        adjList.remove(location);
    }

    public void displayConnections() {
        System.out.println("\n--- City Connections ---");
        for (String city : adjList.keySet()) {
            System.out.println(city + " -> " + adjList.get(city));
        }
    }

    public Set<String> getLocations() {
        return adjList.keySet();
    }
}