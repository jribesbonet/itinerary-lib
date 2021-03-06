package com.jribes.itinerarlib.dijkstra;

public class Edge {
  private final String id;
  private final Vertex source;
  private final Vertex destination;
  private Long weight;

  public Edge(String id, Vertex source, Vertex destination, Long weight) {
    this.id = id;
    this.source = source;
    this.destination = destination;
    this.weight = weight;
  }

  public String getId() {
    return id;
  }

  public Vertex getDestination() {
    return destination;
  }

  public Vertex getSource() {
    return source;
  }

  public Long getWeight() {
    return weight;
  }

  public void setWeight(Long weight) {
    this.weight = weight;
  }

  @Override
  public String toString() {
    return source + " " + destination;
  }

}
