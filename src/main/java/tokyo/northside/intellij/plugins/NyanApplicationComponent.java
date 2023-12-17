package tokyo.northside.intellij.plugins;

import com.intellij.ide.ui.LafManager;

import javax.swing.UIManager;

public class NyanApplicationComponent {
    public NyanApplicationComponent() {
        LafManager.getInstance().addLafManagerListener(__ -> updateProgressBarUi());
        updateProgressBarUi();
    }

    private void updateProgressBarUi() {
        UIManager.put("ProgressBarUI", NyanProgressBarUi.class.getName());
        UIManager.getDefaults().put(NyanProgressBarUi.class.getName(), NyanProgressBarUi.class);
    }
}
