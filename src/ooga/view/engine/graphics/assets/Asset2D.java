package ooga.view.engine.graphics.assets;

import static java.util.Map.entry;

import java.util.Map;
import ooga.view.engine.graphics.Vertex;
import ooga.view.engine.maths.Vector2f;
import ooga.view.engine.maths.Vector3f;

public class Asset2D {

  private static final Map<String, String> rightSystem = Map.ofEntries(
      entry("E", "W"),
      entry("NE","NW"),
      entry("SE","SW")
      );

  private static final Map<String, String> mirrorSystem = Map.ofEntries(
      entry("W", "E"),
      entry("NW","NE"),
      entry("SW","WE")
  );

  private static final float SPEED_MELEE_SPRINT = 0.01f;

  public static Vertex[] getTileVertices() {

    return new Vertex[]{
        new Vertex(new Vector3f(-1f, 1f, 0.0f), new Vector3f(1.0f, 0.0f, 0.0f),
            new Vector2f(0.0f, 0.0f)),
        new Vertex(new Vector3f(-1f, -1f, 0.0f), new Vector3f(0.0f, 1.0f, 0.0f),
            new Vector2f(0.0f, 2.0f)),
        new Vertex(new Vector3f(1f, -1f, 0.0f), new Vector3f(0.0f, 0.0f, 1.0f),
            new Vector2f(2.0f, 2.0f)),
        new Vertex(new Vector3f(1f, 1f, 0.0f), new Vector3f(1.0f, 1.0f, 0.0f),
            new Vector2f(2.0f, 0.0f))
    };

  }

  public static int[] getTileIndices() {
    return new int[]{
        0, 1, 2,
        0, 3, 2
    };
  }

  public static Vertex[] getAgentVertices() {
    return new Vertex[]{
        new Vertex(new Vector3f(-0.5f, 0.5f, -0.01f), new Vector3f(1.0f, 0.0f, 0.0f),
            new Vector2f(0.0f, 0.0f)),
        new Vertex(new Vector3f(-0.5f, -0.5f, -0.01f), new Vector3f(0.0f, 1.0f, 0.0f),
            new Vector2f(0.0f, 1f)),
        new Vertex(new Vector3f(0.5f, -0.5f, -0.01f), new Vector3f(0.0f, 0.0f, 1.0f),
            new Vector2f(1f, 1f)),
        new Vertex(new Vector3f(0.5f, 0.5f, -0.01f), new Vector3f(1.0f, 1.0f, 0.0f),
            new Vector2f(1f, 0f))
    };
  }

  public static Vector2f[] getMirroredTextureCoords() {
    return new Vector2f[]{
        new Vector2f(1f, 0f),
        new Vector2f(1f, 1f),
        new Vector2f(0f, 1f),
        new Vector2f(0f, 0f)
    };
  }

  public static Vector2f[] getNormalTextureCoords() {
    return new Vector2f[]{
        new Vector2f(0f, 0f),
        new Vector2f(0f, 1f),
        new Vector2f(1f, 1f),
        new Vector2f(1f, 0f)
    };
  }

  public static Vertex[] getBulletVertices() {
    return new Vertex[]{
        new Vertex(new Vector3f(-0.2f, 0.1f, -0.01f), new Vector3f(1.0f, 0.0f, 0.0f),
            new Vector2f(0.0f, 0.0f)),
        new Vertex(new Vector3f(-0.2f, -0.1f, -0.01f), new Vector3f(0.0f, 1.0f, 0.0f),
            new Vector2f(0.0f, 1f)),
        new Vertex(new Vector3f(0.2f, -0.1f, -0.01f), new Vector3f(0.0f, 0.0f, 1.0f),
            new Vector2f(1f, 1f)),
        new Vertex(new Vector3f(0.2f, 0.1f, -0.01f), new Vector3f(1.0f, 1.0f, 0.0f),
            new Vector2f(1f, 0.0f))
    };
  }

  public static int[] getAgentIndices() {
    return new int[]{
        0, 1, 2,
        0, 3, 2
    };
  }

  //public static Vector2f getIHateLife() {
  //  return new Vector2f(-5f * 0.06f, 0f);
  //}

  public static Vector2f getIHateLife() {
      return new Vector2f(0f, 0f);
  }

  public static Vector3f getMapPosition() {
    return new Vector3f(0, 0, 1f);
  }

  public static Vector3f getMapRotation() {
    return new Vector3f(0, 0, 0);
  }

  public static Vector3f getMapScale() {
    return new Vector3f(0.06f, 0.06f, 1f);
  }

  public static Vector3f getPlayerPosition() {
    return new Vector3f(0f, 0f, 0f);
  }

  public static Vector3f getPlayerRotation() {
    return new Vector3f(0, 0, 0);
  }

  public static Vector3f getPlayerScale() {
    return new Vector3f(0.8f, 0.8f, 1f);
  }

  public static Vector3f getNonPlayerScale() {
    return new Vector3f(0.3f, 0.3f, 1f);
  }

  public static Vector3f getBulletScale() {
    return new Vector3f(0.020f, 0.010f, 1f);
  }

  public static Vector3f getBulletDelta() {
    return new Vector3f(0.0f, 0.005f, 0f);
  }

  public static Vector3f getSummonDelta() {
    return new Vector3f(0.0f, -0.5f, 0f);
  }

  public static Vector2f getNonPlayerBounds() {
    return new Vector2f(0.05f * getNonPlayerScale().getX(), 0.06f * getNonPlayerScale().getY());
  }

  public static Vector2f getPlayerBounds() {
    return new Vector2f(0.05f * getPlayerScale().getX(), 0.05f * getPlayerScale().getY());
  }//0.01

  public static Vector2f getBulletBounds() {
    return new Vector2f(0.02f * getBulletScale().getX(), 0.02f * getBulletScale().getY());
  }

  public static Vector2f getMapTileBounds() {
    return new Vector2f(0.5f * getMapScale().getX(), 0.5f * getMapScale().getY());
  }//0.2

  public static float getBulletSpeed() {
    return 100.0f;
  }

  public static Vector3f convertDirectionalSpeed(String direction, float speed_scale) {
    if (direction.equals("E")) {
      return new Vector3f(SPEED_MELEE_SPRINT * speed_scale, 0, 0);
    }
    if (direction.equals("N")) {
      return new Vector3f(0, SPEED_MELEE_SPRINT * speed_scale, 0);
    }
    if (direction.equals("S")) {
      return new Vector3f(0, -SPEED_MELEE_SPRINT * speed_scale, 0);
    }
    if (direction.equals("W")) {
      return new Vector3f(-SPEED_MELEE_SPRINT * speed_scale, 0, 0);
    }
    if (direction.equals("NE")) {
      return new Vector3f(SPEED_MELEE_SPRINT * (float) Math.sqrt(2) * speed_scale,
          SPEED_MELEE_SPRINT * (float) Math.sqrt(2) * speed_scale, 0);
    }
    if (direction.equals("SE")) {
      return new Vector3f(SPEED_MELEE_SPRINT * (float) Math.sqrt(2) * speed_scale,
          SPEED_MELEE_SPRINT * (float) Math.sqrt(2) * speed_scale, 0);
    }
    if (direction.equals("NW")) {
      return new Vector3f(SPEED_MELEE_SPRINT * (float) Math.sqrt(2) * speed_scale,
          SPEED_MELEE_SPRINT * (float) Math.sqrt(2) * speed_scale, 0);
    }
    if (direction.equals("SW")) {
      return new Vector3f(SPEED_MELEE_SPRINT * (float) Math.sqrt(2) * speed_scale,
          SPEED_MELEE_SPRINT * (float) Math.sqrt(2) * speed_scale, 0);
    }
    System.err.println(String.format("Location not found: %s", direction));
    return new Vector3f(SPEED_MELEE_SPRINT, 0, 0);
  }

  public static boolean isRightSystem(String direction) {
    //System.out.println(direction);
    return rightSystem.containsKey(direction);
  }

  public static boolean isMirrorSystem(String direction) {
    return mirrorSystem.containsKey(direction);
  }

  public static String getMirroredRightDirection(String direction){
    return mirrorSystem.get(direction);
  }

}
