/*
 * Autopsy Forensic Browser
 *
 * Copyright 2011-2018 Basis Technology Corp.
 * Contact: carrier <at> sleuthkit <dot> org
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.sleuthkit.autopsy.directorytree;

import java.awt.event.ActionListener;
import java.util.logging.Level;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.datamodel.FileSystem;
import org.sleuthkit.datamodel.Volume;
import org.sleuthkit.datamodel.TskCoreException;

/**
 * This is the form / panel to show the File System Details.
 *
 * @author jantonius
 */
final class FileSystemDetailsPanel extends javax.swing.JPanel {
    private static final Logger logger = Logger.getLogger(FileSystemDetailsPanel.class.getName());
    private static final long serialVersionUID = 1L;

    /**
     * Creates new form FileSystemDetailsPanel
     */
    FileSystemDetailsPanel() {
        initComponents();
    }

    FileSystemDetailsPanel(Volume content) {
        initComponents();
        try {
            FileSystem fSystem = content.getFileSystems().get(0);  //Autopsy currently only supports one file system per Volume
            setFileSystemTypeValue(fSystem.getFsType().getDisplayName());
            setImageOffsetValue(Long.toString(fSystem.getImageOffset()));
            setVolumeIDValue(Long.toString(fSystem.getId()));
            setBlockSizeValue(Long.toString(fSystem.getBlock_size()));
            setBlockCountValue(Long.toString(fSystem.getBlock_count()));
            setRootInumValue(Long.toString(fSystem.getRoot_inum()));
            setFirstInumValue(Long.toString(fSystem.getFirst_inum()));
            setLastInumValue(Long.toString(fSystem.getLastInum()));
        } catch (TskCoreException|ArrayIndexOutOfBoundsException ex) {
            logger.log(Level.SEVERE, "Unable to construct FileSystemDetailsPanel",ex);
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OKButton = new javax.swing.JButton();
        genInfoPanel = new javax.swing.JPanel();
        fsTypeLabel = new javax.swing.JLabel();
        imgOffsetLabel = new javax.swing.JLabel();
        volumeIDLabel = new javax.swing.JLabel();
        blockSizeLabel = new javax.swing.JLabel();
        blockCountLabel = new javax.swing.JLabel();
        rootInumLabel = new javax.swing.JLabel();
        firstInumLabel = new javax.swing.JLabel();
        lastInumLabel = new javax.swing.JLabel();
        fsTypeValue = new javax.swing.JLabel();
        imgOffsetValue = new javax.swing.JLabel();
        volumeIDValue = new javax.swing.JLabel();
        blockSizeValue = new javax.swing.JLabel();
        blockCountValue = new javax.swing.JLabel();
        rootInumValue = new javax.swing.JLabel();
        firstInumValue = new javax.swing.JLabel();
        lastInumValue = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        OKButton.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.OKButton.text")); // NOI18N

        genInfoPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        genInfoPanel.setPreferredSize(new java.awt.Dimension(815, 170));

        fsTypeLabel.setFont(fsTypeLabel.getFont().deriveFont(fsTypeLabel.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        fsTypeLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.fsTypeLabel.text")); // NOI18N

        imgOffsetLabel.setFont(imgOffsetLabel.getFont().deriveFont(imgOffsetLabel.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        imgOffsetLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.imgOffsetLabel.text")); // NOI18N

        volumeIDLabel.setFont(volumeIDLabel.getFont().deriveFont(volumeIDLabel.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        volumeIDLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.volumeIDLabel.text")); // NOI18N

        blockSizeLabel.setFont(blockSizeLabel.getFont().deriveFont(blockSizeLabel.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        blockSizeLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.blockSizeLabel.text")); // NOI18N

        blockCountLabel.setFont(blockCountLabel.getFont().deriveFont(blockCountLabel.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        blockCountLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.blockCountLabel.text")); // NOI18N

        rootInumLabel.setFont(rootInumLabel.getFont().deriveFont(rootInumLabel.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        rootInumLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.rootInumLabel.text")); // NOI18N

        firstInumLabel.setFont(firstInumLabel.getFont().deriveFont(firstInumLabel.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        firstInumLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.firstInumLabel.text")); // NOI18N

        lastInumLabel.setFont(lastInumLabel.getFont().deriveFont(lastInumLabel.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        lastInumLabel.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.lastInumLabel.text")); // NOI18N

        fsTypeValue.setFont(fsTypeValue.getFont().deriveFont(fsTypeValue.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        fsTypeValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.fsTypeValue.text")); // NOI18N

        imgOffsetValue.setFont(imgOffsetValue.getFont().deriveFont(imgOffsetValue.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        imgOffsetValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.imgOffsetValue.text")); // NOI18N

        volumeIDValue.setFont(volumeIDValue.getFont().deriveFont(volumeIDValue.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        volumeIDValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.volumeIDValue.text")); // NOI18N

        blockSizeValue.setFont(blockSizeValue.getFont().deriveFont(blockSizeValue.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        blockSizeValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.blockSizeValue.text")); // NOI18N

        blockCountValue.setFont(blockCountValue.getFont().deriveFont(blockCountValue.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        blockCountValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.blockCountValue.text")); // NOI18N

        rootInumValue.setFont(rootInumValue.getFont().deriveFont(rootInumValue.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        rootInumValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.rootInumValue.text")); // NOI18N

        firstInumValue.setFont(firstInumValue.getFont().deriveFont(firstInumValue.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        firstInumValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.firstInumValue.text")); // NOI18N

        lastInumValue.setFont(lastInumValue.getFont().deriveFont(lastInumValue.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        lastInumValue.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.lastInumValue.text")); // NOI18N

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        jLabel2.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.jLabel2.text")); // NOI18N

        jLabel3.setFont(jLabel3.getFont().deriveFont(jLabel3.getFont().getStyle() & ~java.awt.Font.BOLD, 11));
        jLabel3.setText(org.openide.util.NbBundle.getMessage(FileSystemDetailsPanel.class, "FileSystemDetailsPanel.jLabel3.text")); // NOI18N

        javax.swing.GroupLayout genInfoPanelLayout = new javax.swing.GroupLayout(genInfoPanel);
        genInfoPanel.setLayout(genInfoPanelLayout);
        genInfoPanelLayout.setHorizontalGroup(
            genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(genInfoPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fsTypeLabel)
                    .addComponent(imgOffsetLabel)
                    .addComponent(volumeIDLabel)
                    .addComponent(blockSizeLabel))
                .addGap(10, 10, 10)
                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(genInfoPanelLayout.createSequentialGroup()
                        .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(blockSizeValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgOffsetValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)))
                    .addComponent(volumeIDValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fsTypeValue))
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blockCountLabel)
                    .addComponent(rootInumLabel)
                    .addComponent(firstInumLabel)
                    .addComponent(lastInumLabel))
                .addGap(10, 10, 10)
                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(blockCountValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rootInumValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(firstInumValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lastInumValue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(229, Short.MAX_VALUE))
        );
        genInfoPanelLayout.setVerticalGroup(
            genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, genInfoPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(genInfoPanelLayout.createSequentialGroup()
                                .addComponent(fsTypeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(imgOffsetLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(volumeIDLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(blockSizeLabel))
                            .addGroup(genInfoPanelLayout.createSequentialGroup()
                                .addComponent(fsTypeValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(imgOffsetValue)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(volumeIDValue)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(genInfoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(blockSizeValue)
                                    .addComponent(jLabel3))))
                        .addGroup(genInfoPanelLayout.createSequentialGroup()
                            .addComponent(blockCountValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rootInumValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(firstInumValue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lastInumValue))
                        .addGroup(genInfoPanelLayout.createSequentialGroup()
                            .addComponent(blockCountLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rootInumLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(firstInumLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lastInumLabel)))
                    .addComponent(jSeparator1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(genInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(OKButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(genInfoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(OKButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Sets the FileSystem type value on this panel.
     *
     * @param arg the file system type
     */
    public void setFileSystemTypeValue(String arg) {
        fsTypeValue.setText(arg);
    }

    /**
     * Sets the image offset value on this panel.
     *
     * @param arg the image offset
     */
    public void setImageOffsetValue(String arg) {
        imgOffsetValue.setText(arg);
    }

    /**
     * Sets the volume ID value on this panel.
     *
     * @param arg the volume ID
     */
    public void setVolumeIDValue(String arg) {
        volumeIDValue.setText(arg);
    }

    /**
     * Sets the block size value on this panel.
     *
     * @param arg the block size value
     */
    public void setBlockSizeValue(String arg) {
        blockSizeValue.setText(arg);
    }

    /**
     * Sets the block count value on this panel.
     *
     * @param arg the block count value
     */
    public void setBlockCountValue(String arg) {
        blockCountValue.setText(arg);
    }

    /**
     * Sets the root Inum value on this panel.
     *
     * @param arg the root Inum value
     */
    public void setRootInumValue(String arg) {
        rootInumValue.setText(arg);
    }

    /**
     * Sets the first Inum value on this panel.
     *
     * @param arg the first Inum value
     */
    public void setFirstInumValue(String arg) {
        firstInumValue.setText(arg);
    }

    /**
     * Sets the last Inum value on this panel.
     *
     * @param arg the last Inum value
     */
    public void setLastInumValue(String arg) {
        lastInumValue.setText(arg);
    }

    /**
     * Sets the action listener on the OK button on this panel.
     *
     * @param e the action listener
     */
    public void setOKButtonActionListener(ActionListener e) {
        OKButton.addActionListener(e);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OKButton;
    private javax.swing.JLabel blockCountLabel;
    private javax.swing.JLabel blockCountValue;
    private javax.swing.JLabel blockSizeLabel;
    private javax.swing.JLabel blockSizeValue;
    private javax.swing.JLabel firstInumLabel;
    private javax.swing.JLabel firstInumValue;
    private javax.swing.JLabel fsTypeLabel;
    private javax.swing.JLabel fsTypeValue;
    private javax.swing.JPanel genInfoPanel;
    private javax.swing.JLabel imgOffsetLabel;
    private javax.swing.JLabel imgOffsetValue;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lastInumLabel;
    private javax.swing.JLabel lastInumValue;
    private javax.swing.JLabel rootInumLabel;
    private javax.swing.JLabel rootInumValue;
    private javax.swing.JLabel volumeIDLabel;
    private javax.swing.JLabel volumeIDValue;
    // End of variables declaration//GEN-END:variables
}
