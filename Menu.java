package GUI;

import javax.swing.*;

public class Menu extends JMenuBar {
    public JMenuBar jMenu;
    public JMenu jHelp, jPattern, jGame;
    public JMenuItem jExp, jAbout, jCode;
    public JMenuItem jP1, jP2, jP3;
    public JMenuItem jStart, JStop, JNext, JSpeed;
    public JFrame jframe;

    public Menu()
    {
        jMenu = new JMenuBar();
        jGame = new JMenu("Game");
        jMenu.add(jGame);
        jPattern = new JMenu("Choose Pattern");
        jMenu.add(jPattern);
        jHelp = new JMenu("Help");
        jMenu.add(jHelp);
        jExp = new JMenuItem("Explanation");
        jAbout = new JMenuItem("About");
        jCode = new JMenuItem("Code");
        jP1 = new JMenuItem("Pattern 1");
        jP2 = new JMenuItem("Pattern 2");
        jP3 = new JMenuItem("Pattern 3");
        jStart = new JMenuItem("Start");
        JStop = new JMenuItem("Stop");
        JNext = new JMenuItem("Next");
        JSpeed = new JMenuItem("Speed");
        jHelp.add(jExp);
        jHelp.add(jAbout);
        jHelp.add(jCode);
        jPattern.add(jP1);
        jPattern.add(jP2);
        jPattern.add(jP3);
        jGame.add(jStart);
        jGame.add(JStop);
        jGame.add(JNext);
        jGame.add(JSpeed);
    }

    public JMenuBar getMenuBar() {
        return jMenu;
    }
}
