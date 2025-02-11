/*
package ooga.view.test.lwjgl.test2d;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import ooga.view.engine.graphics.render.Renderer2D;
import ooga.view.engine.graphics.Shader;
import ooga.view.engine.io.Input;
import ooga.view.engine.io.Window;
import ooga.view.engine.utils.cyberpunk2d.GenerateAgentsData;
import ooga.view.game_view.agent.agent2d.Agent2DDataHolder;
import ooga.view.game_view.agent.agent2d.Agent2DView;
import ooga.view.game_view.game_state.state2d.BoundingBox;
import org.lwjgl.glfw.GLFW;

public class testAgent implements Runnable {

  public Thread game;
  public Window window;
  public Renderer2D renderer;
  public Shader shader;
  public final int WIDTH = 1080, HEIGHT = 1080;

  public Agent2DView agentView;
  public String mapPath = "/view/textures/2d/cyberpunk/map/map.txt";

  public void start() {
    game = new Thread(this, "game");
    game.start();
  }

  public void init() throws IOException {
    //ResizeSprites.createCanvas();
    //ResizeSprites.resizeAll();
    window = new Window(WIDTH, HEIGHT, "Game");
    shader = new Shader("/view/shaders/2d/cyberpunkTitleVertex.glsl", "/view/shaders/2d/cyberpunkTitleFragment.glsl");
    renderer = new Renderer2D(shader);
    window.setBackgroundColor(22.0f/255.0f, 23.0f/255.0f, 25.0f/255.0f);
    window.create();

    Map<Integer, Agent2DDataHolder> dataHolderMap = new HashMap<>();
    dataHolderMap.put(0, GenerateAgentsData.createSoldier(-3f, 0f));
    //BoundingBox box = new BoundingBox();
    agentView = new Agent2DView(0, dataHolderMap.get(0), box);
    agentView.createMesh();
    shader.create();
  }

  public void run() {
    try {
      init();
    } catch (IOException e) {
       System.out.println("test failed to initiate");
    }
    while (!window.shouldClose() && !Input.isKeyDown(GLFW.GLFW_KEY_ESCAPE)) {
      update();
      render();
      if (Input.isKeyDown(GLFW.GLFW_KEY_F11)) {
        window.setFullscreen(!window.isFullscreen());
      }
    }
    close();
  }

  private void update() {
    window.update();
    //agentView.update();
    System.out.println(agentView.getCenterPosition().getX());
    System.out.println(agentView.getCenterPosition().getY());
    if (Input.isButtonDown(GLFW.GLFW_MOUSE_BUTTON_LEFT)) {
      System.out.println("X: " + Input.getScrollX() + ", Y: " + Input.getScrollY());
    }
    if (Input.isKeyDown(GLFW.GLFW_KEY_Q)){
      agentView.update("E","ATTACK");
    }
    if (Input.isKeyDown(GLFW.GLFW_KEY_W)){
      agentView.update("E","WALK");
    }
    if (Input.isKeyDown(GLFW.GLFW_KEY_D)){
      agentView.update("E","DEATH");
    }
    if (Input.isKeyDown(GLFW.GLFW_KEY_S)){
      agentView.update("S","SPRINT");
    }
    if (Input.isKeyDown(GLFW.GLFW_KEY_N)){
      agentView.update("N","SPRINT");
    }
    if (Input.isKeyDown(GLFW.GLFW_KEY_O)){
      agentView.update("SE","SPRINT");
    }
  }

  private void render() {
    agentView.renderMesh(renderer);
    window.swapBuffers();
  }

  private void close() {
    window.destroy();
    agentView.destroyMesh();
    shader.destroy();
  }

  public static void main(String[] args) {
    new testAgent().start();
  }
}*/