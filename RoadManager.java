class RoadManager {
private Graph graph;

public RoadManager(Graph graph) {
this.graph = graph;
}

public void addLocation(String location) {
graph.addLocation(location);
System.out.println("Location added: " + location);
}

public void removeLocation(String location) {
graph.removeLocation(location);
System.out.println("Location removed: " + location);
}

public void addRoad(String src, String dest) {
if (graph.getLocations().contains(src) && graph.getLocations().contains(dest)) {
graph.addRoad(src, dest);
System.out.println("Road added between " + src + " and " + dest);
} else {
System.out.println("Both locations must exist before adding a road!");
}
}

public void removeRoad(String src, String dest) {
graph.removeRoad(src, dest);
System.out.println("Road removed between " + src + " and " + dest);
}
}
