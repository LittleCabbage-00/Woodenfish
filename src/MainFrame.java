import javax.swing.*;
import java.awt.*;

// 主窗体
public class MainFrame extends JFrame
{
    private static final JLabel label = new JLabel("功德:" + UserData.gongde);
    private static final JPanel panel = new MainPanel();
    public MainFrame()
    {
        setSize(800, 600);
        setResizable(false);

        panel.addMouseListener(new WoodListener());
        add(panel);

        label.setForeground(Color.WHITE);
        label.setFont(new Font(Font.DIALOG, Font.BOLD, 20));
        panel.add(label);

        // 确保窗口在屏幕中央
        setLocationRelativeTo(null);
        setTitle("WoodenFish");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void setLabelText(String text)
    {
        label.setText(text);
    }
}
