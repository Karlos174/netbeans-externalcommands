/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.tristanjl.nb.externalcommmands;

import org.openide.util.NbPreferences;

final class ExternalCommandsPanel extends javax.swing.JPanel
{

    private final ExternalCommandsOptionsPanelController controller;

    ExternalCommandsPanel(ExternalCommandsOptionsPanelController controller)
    {
        this.controller = controller;
        initComponents();
        // TODO listen to changes in form fields and call controller.changed()
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents()
    {

        commandlabel1 = new javax.swing.JLabel();
        command1 = new javax.swing.JFormattedTextField();
        commandlabel2 = new javax.swing.JLabel();
        commandlabel3 = new javax.swing.JLabel();
        commandlabel4 = new javax.swing.JLabel();
        commandlabel5 = new javax.swing.JLabel();
        commandlabel6 = new javax.swing.JLabel();
        commandlabel7 = new javax.swing.JLabel();
        commandlabel8 = new javax.swing.JLabel();
        commandlabel9 = new javax.swing.JLabel();
        commandlabel10 = new javax.swing.JLabel();
        command2 = new javax.swing.JFormattedTextField();
        command3 = new javax.swing.JFormattedTextField();
        command4 = new javax.swing.JFormattedTextField();
        command5 = new javax.swing.JFormattedTextField();
        command6 = new javax.swing.JFormattedTextField();
        command7 = new javax.swing.JFormattedTextField();
        command8 = new javax.swing.JFormattedTextField();
        command9 = new javax.swing.JFormattedTextField();
        command10 = new javax.swing.JFormattedTextField();
        commandName1 = new javax.swing.JFormattedTextField();
        commandName2 = new javax.swing.JFormattedTextField();
        commandName3 = new javax.swing.JFormattedTextField();
        commandName4 = new javax.swing.JFormattedTextField();
        commandName5 = new javax.swing.JFormattedTextField();
        commandName6 = new javax.swing.JFormattedTextField();
        commandName7 = new javax.swing.JFormattedTextField();
        commandName8 = new javax.swing.JFormattedTextField();
        commandName9 = new javax.swing.JFormattedTextField();
        commandName10 = new javax.swing.JFormattedTextField();

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel1, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel1.text")); // NOI18N

        command1.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command1.text")); // NOI18N
        command1.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command1.toolTipText")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel2, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel2.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel3, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel3.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel4, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel4.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel5, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel5.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel6, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel6.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel7, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel7.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel8, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel8.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel9, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel9.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(commandlabel10, org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel10.text")); // NOI18N

        command2.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command2.text")); // NOI18N
        command2.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command2.toolTipText")); // NOI18N

        command3.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command3.text")); // NOI18N
        command3.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command3.toolTipText")); // NOI18N

        command4.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command4.text")); // NOI18N
        command4.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command4.toolTipText")); // NOI18N

        command5.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command5.text")); // NOI18N
        command5.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command5.toolTipText")); // NOI18N

        command6.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command6.text")); // NOI18N
        command6.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command6.toolTipText")); // NOI18N

        command7.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command7.text")); // NOI18N
        command7.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command7.toolTipText")); // NOI18N

        command8.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command8.text")); // NOI18N
        command8.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command8.toolTipText")); // NOI18N

        command9.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command9.text")); // NOI18N
        command9.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command9.toolTipText")); // NOI18N

        command10.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command10.text")); // NOI18N
        command10.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.command10.toolTipText")); // NOI18N

        commandName1.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName1.text")); // NOI18N
        commandName1.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName1.toolTipText")); // NOI18N

        commandName2.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName2.text")); // NOI18N
        commandName2.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName2.toolTipText")); // NOI18N

        commandName3.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName3.text")); // NOI18N
        commandName3.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName3.toolTipText")); // NOI18N

        commandName4.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName4.text")); // NOI18N
        commandName4.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName4.toolTipText")); // NOI18N

        commandName5.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName5.text")); // NOI18N
        commandName5.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName5.toolTipText")); // NOI18N

        commandName6.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName6.text")); // NOI18N
        commandName6.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName6.toolTipText")); // NOI18N

        commandName7.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName7.text")); // NOI18N
        commandName7.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName7.toolTipText")); // NOI18N

        commandName8.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName8.text")); // NOI18N
        commandName8.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName8.toolTipText")); // NOI18N

        commandName9.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName9.text")); // NOI18N
        commandName9.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName9.toolTipText")); // NOI18N

        commandName10.setText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName10.text")); // NOI18N
        commandName10.setToolTipText(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandName10.toolTipText")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(commandlabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(commandName10, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(command10, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel1)
                                .addGap(18, 18, 18)
                                .addComponent(commandName1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(commandName7, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel8)
                                .addGap(18, 18, 18)
                                .addComponent(commandName8, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel9)
                                .addGap(18, 18, 18)
                                .addComponent(commandName9, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel6)
                                .addGap(18, 18, 18)
                                .addComponent(commandName6, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel5)
                                .addGap(18, 18, 18)
                                .addComponent(commandName5, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel2)
                                .addGap(18, 18, 18)
                                .addComponent(commandName2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel4)
                                .addGap(18, 18, 18)
                                .addComponent(commandName4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(commandlabel3)
                                .addGap(18, 18, 18)
                                .addComponent(commandName3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(command1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command2, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command3, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command4, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command5, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command6, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command7, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command8, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(command9, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(7, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(commandlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(command1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(commandName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(command2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commandlabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(commandName2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(command3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commandName3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commandlabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(commandlabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(command4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commandName4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(commandlabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(command5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commandName5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(commandlabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(command6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commandName6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(commandlabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(command7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commandName7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(commandlabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(command8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commandName8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(commandlabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(command9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(commandName9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(command10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commandName10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(commandlabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        commandlabel1.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel1.AccessibleContext.accessibleName")); // NOI18N
        commandlabel6.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(ExternalCommandsPanel.class, "ExternalCommandsPanel.commandlabel6.AccessibleContext.accessibleName")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    void load()
    {
        commandName1.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName1", ""));
        commandName2.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName2", ""));
        commandName3.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName3", ""));
        commandName4.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName4", ""));
        commandName5.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName5", ""));
        commandName6.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName6", ""));
        commandName7.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName7", ""));
        commandName8.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName8", ""));
        commandName9.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName9", ""));
        commandName10.setText(NbPreferences.forModule(ExternalCommands.class).get("commandName10", ""));
        
        command1.setText(NbPreferences.forModule(ExternalCommands.class).get("command1", ""));
        command2.setText(NbPreferences.forModule(ExternalCommands.class).get("command2", ""));
        command3.setText(NbPreferences.forModule(ExternalCommands.class).get("command3", ""));
        command4.setText(NbPreferences.forModule(ExternalCommands.class).get("command4", ""));
        command5.setText(NbPreferences.forModule(ExternalCommands.class).get("command5", ""));
        command6.setText(NbPreferences.forModule(ExternalCommands.class).get("command6", ""));
        command7.setText(NbPreferences.forModule(ExternalCommands.class).get("command7", ""));
        command8.setText(NbPreferences.forModule(ExternalCommands.class).get("command8", ""));
        command9.setText(NbPreferences.forModule(ExternalCommands.class).get("command9", ""));
        command10.setText(NbPreferences.forModule(ExternalCommands.class).get("command10", ""));
    }

    void store()
    {
        NbPreferences.forModule(ExternalCommands.class).put("commandName1", commandName1.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName2", commandName2.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName3", commandName3.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName4", commandName4.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName5", commandName5.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName6", commandName6.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName7", commandName7.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName8", commandName8.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName9", commandName9.getText());
        NbPreferences.forModule(ExternalCommands.class).put("commandName10", commandName10.getText());
        
        NbPreferences.forModule(ExternalCommands.class).put("command1", command1.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command2", command2.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command3", command3.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command4", command4.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command5", command5.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command6", command6.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command7", command7.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command8", command8.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command9", command9.getText());
        NbPreferences.forModule(ExternalCommands.class).put("command10", command10.getText());
    }

    boolean valid()
    {
        // TODO check whether form is consistent and complete
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField command1;
    private javax.swing.JFormattedTextField command10;
    private javax.swing.JFormattedTextField command2;
    private javax.swing.JFormattedTextField command3;
    private javax.swing.JFormattedTextField command4;
    private javax.swing.JFormattedTextField command5;
    private javax.swing.JFormattedTextField command6;
    private javax.swing.JFormattedTextField command7;
    private javax.swing.JFormattedTextField command8;
    private javax.swing.JFormattedTextField command9;
    private javax.swing.JFormattedTextField commandName1;
    private javax.swing.JFormattedTextField commandName10;
    private javax.swing.JFormattedTextField commandName2;
    private javax.swing.JFormattedTextField commandName3;
    private javax.swing.JFormattedTextField commandName4;
    private javax.swing.JFormattedTextField commandName5;
    private javax.swing.JFormattedTextField commandName6;
    private javax.swing.JFormattedTextField commandName7;
    private javax.swing.JFormattedTextField commandName8;
    private javax.swing.JFormattedTextField commandName9;
    private javax.swing.JLabel commandlabel1;
    private javax.swing.JLabel commandlabel10;
    private javax.swing.JLabel commandlabel2;
    private javax.swing.JLabel commandlabel3;
    private javax.swing.JLabel commandlabel4;
    private javax.swing.JLabel commandlabel5;
    private javax.swing.JLabel commandlabel6;
    private javax.swing.JLabel commandlabel7;
    private javax.swing.JLabel commandlabel8;
    private javax.swing.JLabel commandlabel9;
    // End of variables declaration//GEN-END:variables
}
