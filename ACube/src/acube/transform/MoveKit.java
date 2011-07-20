package acube.transform;

import static acube.Turn.B1;
import static acube.Turn.B2;
import static acube.Turn.B3;
import static acube.Turn.D1;
import static acube.Turn.D2;
import static acube.Turn.D3;
import static acube.Turn.E1;
import static acube.Turn.E2;
import static acube.Turn.E3;
import static acube.Turn.F1;
import static acube.Turn.F2;
import static acube.Turn.F3;
import static acube.Turn.L1;
import static acube.Turn.L2;
import static acube.Turn.L3;
import static acube.Turn.M1;
import static acube.Turn.M2;
import static acube.Turn.M3;
import static acube.Turn.R1;
import static acube.Turn.R2;
import static acube.Turn.R3;
import static acube.Turn.S1;
import static acube.Turn.S2;
import static acube.Turn.S3;
import static acube.Turn.U1;
import static acube.Turn.U2;
import static acube.Turn.U3;
import static acube.Turn.b1;
import static acube.Turn.b2;
import static acube.Turn.b3;
import static acube.Turn.d1;
import static acube.Turn.d2;
import static acube.Turn.d3;
import static acube.Turn.f1;
import static acube.Turn.f2;
import static acube.Turn.f3;
import static acube.Turn.l1;
import static acube.Turn.l2;
import static acube.Turn.l3;
import static acube.Turn.r1;
import static acube.Turn.r2;
import static acube.Turn.r3;
import static acube.Turn.u1;
import static acube.Turn.u2;
import static acube.Turn.u3;
import acube.Corner;
import acube.Edge;
import acube.Turn;

public final class MoveKit {
  private static final Turn[][][] TurnBase = {
      { { U1 }, { U1 } }, { { D1 }, { D1 } }, { { F1 }, { F1 } }, { { B1 }, { B1 } }, { { L1 }, { L1 } },
      { { R1 }, { R1 } }, { { u1 }, { D1 } }, { { d1 }, { U1 } }, { { f1 }, { B1 } }, { { b1 }, { F1 } },
      { { l1 }, { R1 } }, { { r1 }, { L1 } }, { { U2 }, { U1, U1 } }, { { D2 }, { D1, D1 } }, { { F2 }, { F1, F1 } },
      { { B2 }, { B1, B1 } }, { { L2 }, { L1, L1 } }, { { R2 }, { R1, R1 } }, { { u2 }, { D1, D1 } },
      { { d2 }, { U1, U1 } }, { { f2 }, { B1, B1 } }, { { b2 }, { F1, F1 } }, { { l2 }, { R1, R1 } },
      { { r2 }, { L1, L1 } }, { { U3 }, { U1, U1, U1 } }, { { D3 }, { D1, D1, D1 } }, { { F3 }, { F1, F1, F1 } },
      { { B3 }, { B1, B1, B1 } }, { { L3 }, { L1, L1, L1 } }, { { R3 }, { R1, R1, R1 } }, { { u3 }, { D1, D1, D1 } },
      { { d3 }, { U1, U1, U1 } }, { { f3 }, { B1, B1, B1 } }, { { b3 }, { F1, F1, F1 } }, { { l3 }, { R1, R1, R1 } },
      { { r3 }, { L1, L1, L1 } }, { { E1 }, { U1, D1, D1, D1 } }, { { E2 }, { U1, U1, D1, D1 } },
      { { E3 }, { U1, U1, U1, D1 } }, { { S1 }, { B1, F1, F1, F1 } }, { { S2 }, { B1, B1, F1, F1 } },
      { { S3 }, { B1, B1, B1, F1 } }, { { M1 }, { R1, L1, L1, L1 } }, { { M2 }, { R1, R1, L1, L1 } },
      { { M3 }, { R1, R1, R1, L1 } } };

  public static TurnTable cornerTwist(final Corner[] mask, final Corner[] twistMask, final Turn[] turns) {
    return MoveTable.instance(new CornerTwist(mask, twistMask, turns), TurnBase);
  }

  public static TurnTable edgeFlip(final Edge[] mask, final Edge[] flipMask, final Turn[] turns) {
    return MoveTable.instance(new EdgeFlip(mask, flipMask, turns), TurnBase);
  }

  public static TurnTable cornerPosition(final Corner[] mask, final Turn[] turns) {
    return MoveTable.instance(new CornerPosition(mask, turns), TurnBase);
  }

  public static TurnTable mEdgePositionSet(final Edge[] mask, final Turn[] turns) {
    return MoveTable.instance(new MEdgePositionSet(mask, turns), TurnBase);
  }

  public static TurnTable mEdgePosition(final Edge[] mask, final Turn[] turns) {
    return MoveTable.instance(new MEdgePosition(mask, turns), TurnBase);
  }

  public static TurnTable uEdgePosition(final Edge[] mask, final Turn[] turns) {
    return MoveTable.instance(new UEdgePosition(mask, turns), TurnBase);
  }

  public static TurnTable dEdgePosition(final Edge[] mask, final Turn[] turns) {
    return MoveTable.instance(new DEdgePosition(mask, turns), TurnBase);
  }

  private MoveKit() {}
}
