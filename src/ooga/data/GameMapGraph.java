package ooga.data;

import ooga.data.GameCell;
import ooga.model.interfaces.gameMap.Cell;

public class GameMapGraph {
    private Cell[][] cellArray;

    public GameMapGraph(int row, int column) {
        cellArray = new GameCell[row][column];
        for (int i = 0; i< row; i++) {
            for (int j = 0; j < column; j++) {
                cellArray[i][j] = new GameCell(0,0);
            }
        }
    }
    public void setElement(int row, int column, int state, int imageIndex) {
        cellArray[row][column].setImage(imageIndex);
        cellArray[row][column].setState(state);
    }
//    private Map<Cell, List<Cell>> adjacencyList;
//    private int numOfEdge;
//    private Cell startingCell;
//
//    public GameMapGraph() {
//        //assume starting cell for now
//        startingCell = new GameCell(0, 0);
//        this.adjacencyList = new HashMap<>();
//        addVertex(startingCell);
//    }
//    private int numNode() {
//        return adjacencyList.size();
//    }
//
//    public Cell getStartingCell() {
//        return startingCell;
//    }
//
//    public void addEdge(Cell v, Cell w) {
//        if (!hasVertex(v)) {
//            addVertex(v);
//        }
//        if (!hasVertex(w)) {
//            addVertex(w);
//        }
//        if (!hasEdge(v, w)) {
//            numOfEdge++;
//        }
//        adjacencyList.get(v).add(w);
//        adjacencyList.get(w).add(v);
//    }
//
//    /**
//     * Adds vertex v to this graph (if it is not already a vertex).
//     *
//     * @param  v the vertex
//     */
//    public void addVertex(Cell v) {
//        if (!hasVertex(v)) {
//            adjacencyList.put(v, new ArrayList<>());
//        }
//    }
//
//
//    public List getNeighbours(Cell v) {
//        isVertex(v);
//        return adjacencyList.get(v);
//    }
//
//
//    public boolean hasVertex(Cell v) {
//        return adjacencyList.keySet().contains(v);
//    }
//
//
//    public boolean hasEdge(Cell v, Cell w) {
//        isVertex(v);
//        isVertex(w);
//        return adjacencyList.get(v).contains(w);
//    }
//
//    private void isVertex(Cell v) {
//        try{
//            if (!adjacencyList.keySet().contains(v)) {
//                throw new Exception("Cell " + /*v.getName()*/ "CellName" + "is not vertex");
//            }
//        } catch (Exception e) {
//            /*terminate the program or try to throw the exception up*/
//        }
//    }


}
