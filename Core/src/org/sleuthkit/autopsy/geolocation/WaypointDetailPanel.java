/*
 * Autopsy Forensic Browser
 *
 * Copyright 2019 Basis Technology Corp.
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
package org.sleuthkit.autopsy.geolocation;

import java.awt.Point;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import javax.swing.ImageIcon;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSeparator;
import org.sleuthkit.autopsy.coreutils.Logger;
import org.sleuthkit.datamodel.TskCoreException;

/**
 * A panel for displaying the details of a waypoint.
 */
final class WaypointDetailPanel extends JPanel {
    
    private static final long serialVersionUID = 1L;
    private static final Logger logger = Logger.getLogger(WaypointDetailPanel.class.getName());
    
    private final List<ActionListener> listeners;
    
    private MapWaypoint waypoint;

    /**
     * Constructs new a WaypointDetailPanel.
     */
    WaypointDetailPanel() {
        initComponents();
        
        listeners = new ArrayList<>();
        mainPanel.setBackground(detailsPane.getBackground());
    }

    /**
     * Sets the current waypoint.
     *
     * @param waypoint The panel waypoint
     */
    void setWaypoint(MapWaypoint waypoint) {
        this.waypoint = waypoint;
        
        ImageIcon image = waypoint.getImage();
        if (image != null) {
            imageLabel.setIcon(image);
        }
        detailsPane.setText(waypoint.getHTMLFormattedWaypointDetails());
    }

    /**
     * Adds listeners for the panel close button.
     *
     * @param listener
     */
    void addActionListener(ActionListener listener) {
        listeners.add(listener);
    }
    
    /**
     * Show the popup menu if the given MouseEvent was a popup event.
     * 
     * @param evt the current event
     */
    void showPopupMenu(MouseEvent evt) {
        if(evt.isPopupTrigger()) {
            try {
                showPopupMenu(evt.getPoint());
            } catch (TskCoreException ex) {
                logger.log(Level.WARNING, "Unable to show popup menu for selected waypoint");
            }
        }
    }
    
    /**
     * Show the popup menu at the given location for waypoint
     * 
     * @param point Mouse click location
     * 
     * @throws TskCoreException 
     */
    void showPopupMenu(Point point) throws TskCoreException {
        JMenuItem[] items = waypoint.getMenuItems();
        JPopupMenu popupMenu = new JPopupMenu();
        for(JMenuItem menu: items) {

            if(menu != null) {
                popupMenu.add(menu);
            } else {
                popupMenu.add(new JSeparator());
            }
        }
        popupMenu.show(this, point.x, point.y);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonPanel = new javax.swing.JPanel();
        closeButton = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        mainPanel = new javax.swing.JPanel();
        imageLabel = new javax.swing.JLabel();
        detailsPane = new javax.swing.JTextPane();

        setMaximumSize(new java.awt.Dimension(300, 300));
        setLayout(new java.awt.GridBagLayout());

        buttonPanel.setLayout(new java.awt.BorderLayout());

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/sleuthkit/autopsy/images/close-icon.png"))); // NOI18N
        org.openide.awt.Mnemonics.setLocalizedText(closeButton, org.openide.util.NbBundle.getMessage(WaypointDetailPanel.class, "WaypointDetailPanel.closeButton.text")); // NOI18N
        closeButton.setBorder(null);
        closeButton.setOpaque(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        buttonPanel.add(closeButton, java.awt.BorderLayout.EAST);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.0;
        add(buttonPanel, gridBagConstraints);

        mainPanel.setMaximumSize(new java.awt.Dimension(300, 300));
        mainPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                mainPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                mainPanelMouseReleased(evt);
            }
        });
        mainPanel.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(imageLabel, org.openide.util.NbBundle.getMessage(WaypointDetailPanel.class, "WaypointDetailPanel.imageLabel.text")); // NOI18N
        imageLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imageLabelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                imageLabelMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        mainPanel.add(imageLabel, gridBagConstraints);

        detailsPane.setEditable(false);
        detailsPane.setContentType("text/html");
        detailsPane.setMaximumSize(new java.awt.Dimension(300, 300));
        detailsPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                detailsPaneMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                detailsPaneMouseReleased(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        mainPanel.add(detailsPane, gridBagConstraints);

        scrollPane.setViewportView(mainPanel);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        add(scrollPane, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        for (ActionListener listener : listeners) {
            listener.actionPerformed(evt);
        }
    }//GEN-LAST:event_closeButtonActionPerformed

    private void mainPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMousePressed
       showPopupMenu(evt);
    }//GEN-LAST:event_mainPanelMousePressed

    private void mainPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mainPanelMouseReleased
       showPopupMenu(evt);
    }//GEN-LAST:event_mainPanelMouseReleased

    private void detailsPaneMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsPaneMousePressed
       showPopupMenu(evt);
    }//GEN-LAST:event_detailsPaneMousePressed

    private void detailsPaneMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailsPaneMouseReleased
       showPopupMenu(evt);
    }//GEN-LAST:event_detailsPaneMouseReleased

    private void imageLabelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMousePressed
        showPopupMenu(evt);
    }//GEN-LAST:event_imageLabelMousePressed

    private void imageLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imageLabelMouseReleased
       showPopupMenu(evt);
    }//GEN-LAST:event_imageLabelMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JTextPane detailsPane;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
