/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.tristanjl.nb.externalcommmands;

import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;
import org.openide.awt.*;
import java.util.List;
import org.openide.util.*;
import org.openide.util.actions.Presenter;

@ActionID(
        category = "Tools",
        id = "io.github.tristanjl.nb.externalcommmands.ExternalCommands"
)
@ActionRegistration(
        displayName = "#CTL_ExternalCommands",  lazy = false
)
@ActionReferences({
    @ActionReference(path = "Menu/Tools", position = 10, separatorAfter = 11),
})
@NbBundle.Messages("CTL_ExternalCommands=External Commands")
public final class ExternalCommands extends AbstractAction implements ActionListener, Presenter.Menu {
        
    @Override
    public void actionPerformed(ActionEvent e)
    {
    }
    
    @Override
    public JMenuItem getMenuPresenter() {
        JMenu menu = new JMenu(Bundle.CTL_ExternalCommands());
        //List<? extends Action> actionsForPath = Utilities.actionsForPath("Menu/Tools/ExternalCommands");
        for (Action action : getActions()) {
            menu.add(action);
        }
        return menu;
    }
    
    private List<Action> getActions(){
        List<Action> actions = new ArrayList<>();
        for(int commandIndex = 1; commandIndex<11; commandIndex++){
            String commandName = NbPreferences.forModule(ExternalCommands.class).get("commandName" + commandIndex, null);
            if(commandName != null && !commandName.isEmpty()){
                actions.add(new ExternalCommandAction(commandIndex));
            }
        }
        if(actions.isEmpty()){
            actions.add(new HintAction());
        }
        return actions;
    }
    
    private static class HintAction extends AbstractAction {

        public HintAction() {
            super("<No External Command defined>");
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
        
    }
}
