object InnerClasses {
  class Graph {
    class Node {
      var connectedNodes: List[Graph#Node] = Nil
      def connectTo(node: Graph#Node): Unit = {
        if (!connectedNodes.exists(node.equals)) {
          connectedNodes = node :: connectedNodes
        }
      }
    }
    var nodes: List[Node] = Nil
    def newNode: Node = {
      val res: Node = new Node
      nodes = res :: nodes
      res
    }
  }
  def main(args: Array[String]): Unit = {
    val graph1: Graph = new Graph
    val node1: graph1.Node = graph1.newNode
    val node2: graph1.Node = graph1.newNode
    val node3: graph1.Node = graph1.newNode
    node1.connectTo(node2)
    node3.connectTo(node1)
  }
}
