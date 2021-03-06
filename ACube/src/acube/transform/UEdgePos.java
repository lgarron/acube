package acube.transform;

import static acube.Edge.DB;
import static acube.Edge.DF;
import static acube.Edge.DL;
import static acube.Edge.DR;
import static acube.Edge.UB;
import static acube.Edge.UF;
import static acube.Edge.UL;
import static acube.Edge.UR;
import static acube.Tools.edgesKey;
import java.util.EnumSet;
import acube.Edge;
import acube.Turn;
import acube.pack.PackKit;
import acube.pack.PackPositionOrdered;

final class UEdgePos extends MoveToB<Edge> {
  private static final boolean[] UD_EDGES = PackKit.getEdgeMaskFor(EnumSet.of(UF, UR, UB, UL, DF, DR, DB, DL));
  private static final EnumSet<Edge> U_EDGES = EnumSet.of(UF, UR, UB, UL);

  public UEdgePos(final EnumSet<Edge> edgeMask) {
    super(new PackPositionOrdered<Edge>(PackKit.edgeMask(edgeMask), PackKit.edgeMask(U_EDGES), Edge.values()), "UEP-" +
        edgesKey(edgeMask));
  }

  @Override
  public void turn(final Turn turn) {
    cycleEdges(turn);
  }

  @Override
  public boolean isInB() {
    return areUsedIn(UD_EDGES);
  }

  public void setup(final Edge[] edges) {
    pack.setValues(PackKit.fillIndices(edges, U_EDGES.toArray(new Edge[0])));
  }
}
