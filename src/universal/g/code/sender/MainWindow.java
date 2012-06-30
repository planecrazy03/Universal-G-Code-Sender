/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on Jun 26, 2012, 3:04:38 PM
 */
package universal.g.code.sender;

import gnu.io.CommPortIdentifier;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author wwinder
 */
public class MainWindow extends javax.swing.JFrame implements SerialCommunicatorListener {

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();
        initProgram();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lineBreakGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        commandLabel = new javax.swing.JLabel();
        lineBreakNR = new javax.swing.JRadioButton();
        lineBreakRN = new javax.swing.JRadioButton();
        commandTextField = new javax.swing.JTextField();
        commPortComboBox = new javax.swing.JComboBox();
        refreshButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        lineBreakN = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        consoleTextArea = new javax.swing.JTextArea();
        scrollWindowCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        browseButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        fileTextField = new javax.swing.JTextField();
        fileLabel = new javax.swing.JLabel();
        overrideSpeedCheckBox = new javax.swing.JCheckBox();
        overrideSpeedValueSpinner = new javax.swing.JSpinner();
        sentRowsLabel = new javax.swing.JLabel();
        sentRowsValueLabel = new javax.swing.JLabel();
        rowsLabel = new javax.swing.JLabel();
        rowsValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Serial"));

        commandLabel.setText("Command");

        lineBreakGroup.add(lineBreakNR);
        lineBreakNR.setText("\\n\\r");

        lineBreakGroup.add(lineBreakRN);
        lineBreakRN.setSelected(true);
        lineBreakRN.setText("\\r\\n");

        commandTextField.setEnabled(false);
        commandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commandTextFieldActionPerformed(evt);
            }
        });

        refreshButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/refresh.gif"))); // NOI18N
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.setEnabled(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        lineBreakGroup.add(lineBreakN);
        lineBreakN.setText("\\n");
        lineBreakN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lineBreakNActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(commandTextField)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(commandLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lineBreakN)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lineBreakNR)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(lineBreakRN))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(commPortComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 237, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(refreshButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(openButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(closeButton)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(lineBreakNR)
                        .add(lineBreakRN)
                        .add(lineBreakN))
                    .add(commandLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(commandTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(commPortComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(refreshButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(openButton)
                    .add(closeButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        consoleTextArea.setColumns(20);
        consoleTextArea.setRows(5);
        jScrollPane2.setViewportView(consoleTextArea);

        scrollWindowCheckBox.setText("Scroll output window");
        scrollWindowCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollWindowCheckBoxActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("File transfer"));

        browseButton.setText("Browse");
        browseButton.setEnabled(false);
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        printButton.setText("Send");
        printButton.setEnabled(false);
        printButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printButtonActionPerformed(evt);
            }
        });

        stopButton.setText("Stop");
        stopButton.setEnabled(false);
        stopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopButtonActionPerformed(evt);
            }
        });

        fileTextField.setEnabled(false);

        fileLabel.setText("File");

        overrideSpeedCheckBox.setText("Override speed");
        overrideSpeedCheckBox.setEnabled(false);

        overrideSpeedValueSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(60), Integer.valueOf(1), null, Integer.valueOf(1)));
        overrideSpeedValueSpinner.setEnabled(false);

        sentRowsLabel.setText("Sent rows:");

        sentRowsValueLabel.setText("0");

        rowsLabel.setText("Rows:");

        rowsValueLabel.setText("0");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fileLabel)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(printButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(stopButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(overrideSpeedValueSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(overrideSpeedCheckBox))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(sentRowsLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(sentRowsValueLabel)
                                .add(49, 49, 49)
                                .add(rowsLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(rowsValueLabel)))
                        .addContainerGap(121, Short.MAX_VALUE))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(fileTextField)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButton))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(fileLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fileTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(printButton)
                    .add(stopButton)
                    .add(overrideSpeedCheckBox)
                    .add(overrideSpeedValueSpinner, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(sentRowsLabel)
                    .add(sentRowsValueLabel)
                    .add(rowsLabel)
                    .add(rowsValueLabel))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .add(scrollWindowCheckBox)
                                .add(0, 0, Short.MAX_VALUE))
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(scrollWindowCheckBox))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /** End of generated code.
     */
    
    /** Generated callback functions, hand coded.
     */
    private void scrollWindowCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollWindowCheckBoxActionPerformed
        DefaultCaret caret = (DefaultCaret)consoleTextArea.getCaret();
        if (scrollWindowCheckBox.isSelected()) {
          caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
          consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
        } else {
            caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        }
    }//GEN-LAST:event_scrollWindowCheckBoxActionPerformed

    private void commandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandTextFieldActionPerformed
                        String str = this.commandTextField.getText().replaceAll("(\\r\\n|\\n\\r|\\r|\\n)", "");
                        this.consoleTextArea.append(">>> "+str+"\n");
                        this.commPort.sendCommandToComm(str + "\n");
                        this.commandTextField.setText("");
                        this.commandList.add(str);

                        try {
                            if (this.commPort.isCommPortOpen() == false) {
                                this.closeCommConnection();
                                this.displayErrorDialog("The serial port has closed unexpectedly.");
                            }
                        } catch (Exception e) {
                            this.displayErrorDialog("Unhandled error with serial port: "+e.getMessage());
                        }
    }//GEN-LAST:event_commandTextFieldActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        try {
            boolean ret = commPort.openCommPort(commPortComboBox.getSelectedItem().toString(), 9600);
            this.updateControlsForComm(ret);
        } catch (Exception e) {
            this.displayErrorDialog("Error opening connection: "+e.getMessage());
        }
    }//GEN-LAST:event_openButtonActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadPortSelector();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileTextField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            processFile(fileChooser.getSelectedFile());
        } else {
            System.out.println("Open command cancelled by user.");
        }
    }//GEN-LAST:event_browseButtonActionPerformed

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        closeCommConnection();
    }//GEN-LAST:event_closeButtonActionPerformed

    private void lineBreakNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lineBreakNActionPerformed
        this.commPort.setLineTerminator(this.getNewline());
    }//GEN-LAST:event_lineBreakNActionPerformed

    private void printButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printButtonActionPerformed
        try {
            this.sentRowsValueLabel.setText("0");
            this.updateControlsForSend(true);
            int totalLines = Integer.parseInt(this.rowsValueLabel.getText());
            this.commPort.streamFileToComm(this.gcodeFile, totalLines);
        } catch (Exception e) {
            this.displayErrorDialog("Error while starting file stream: "+e.getMessage());
        }
    }//GEN-LAST:event_printButtonActionPerformed

    private void stopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopButtonActionPerformed
        this.commPort.cancelSend();
        this.updateControlsForSend(true);
    }//GEN-LAST:event_stopButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
        
    private void initProgram() {
        this.loadPortSelector();
        
        // Hook the view up to the model
        this.commandList = new ArrayList<String>();
        this.commPort = new SerialCommunicator();
        
        // Setup file browser.
        this.fileChooser = new JFileChooser();
        this.fileChooser.setFileFilter(new GcodeFileTypeFilter());

        // Register listeners
        this.commPort.setFileStreamCompleteListener(this);
        this.commPort.setCommandCompleteListener(this);
        this.commPort.setCommandPreprocessorListener(this);
        this.commPort.setCommConsoleListener(this);
    }
    
    private void updateControlsForComm(boolean isOpen) {
        if (isOpen) {
            this.commPortComboBox.setEnabled(false);
            this.refreshButton.setEnabled(false);
            this.openButton.setEnabled(false);
            this.closeButton.setEnabled(true);
            this.commandTextField.setEnabled(true);
        } else {
            this.commPortComboBox.setEnabled(true);
            this.refreshButton.setEnabled(true);
            this.openButton.setEnabled(true);
            this.closeButton.setEnabled(false);
            this.commandTextField.setEnabled(false);
        }
        
        this.updateFileControlsForComm(isOpen);
    }
    
    private void updateFileControlsForComm(boolean isOpen) {
        if (isOpen) {
            this.printButton.setEnabled(true);
            this.browseButton.setEnabled(true);
            this.overrideSpeedCheckBox.setEnabled(true);
            this.overrideSpeedValueSpinner.setEnabled(true);
            this.fileTextField.setEnabled(true);
        } else {
            this.printButton.setEnabled(false);
            this.browseButton.setEnabled(false);
            this.overrideSpeedCheckBox.setEnabled(false);
            this.overrideSpeedValueSpinner.setEnabled(false);
            this.fileTextField.setEnabled(false);
            
            // This might be on... turn it off.
            this.stopButton.setEnabled(false);
        }
    }
    
    private void updateControlsForSend(boolean isSending) {
        if (isSending) {
            this.stopButton.setEnabled(true);
            this.commandTextField.setEnabled(false);
            this.overrideSpeedCheckBox.setEnabled(false);
            this.overrideSpeedValueSpinner.setEnabled(false);
        } else {
            this.stopButton.setEnabled(false);
            this.commandTextField.setEnabled(true);
            this.overrideSpeedCheckBox.setEnabled(true);
            this.overrideSpeedValueSpinner.setEnabled(true);
        }
    }
    
    // Scans for comm ports and puts them in the comm port combo box.
    private void loadPortSelector() {
        commPortComboBox.removeAllItems();
        
        List<CommPortIdentifier> portList = CommPortUtils.getSerialPortList();
        
        if (portList.size() < 1) {
            this.displayErrorDialog("No serial ports found.");
        } else {
            // Sort?
            //java.util.Collections.sort(portList);

            java.util.Iterator<CommPortIdentifier> portIter = portList.iterator();

            while ( portIter.hasNext() ) 
            {
                CommPortIdentifier portIdentifier = portIter.next();
                commPortComboBox.addItem(portIdentifier.getName());
            }
            
            commPortComboBox.setSelectedIndex(0);
        }
    }
    
    // Processes input file.
    // This could theoretically scan it for errors, but GcodeSender just counts
    // how many lines are in it.
    private void processFile(File file) {
        gcodeFile = file;
        Integer numRows = 0;
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(file));

            byte[] c = new byte[1024];

            int readChars;
            while ((readChars = is.read(c)) != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n')
                        ++numRows;
                }
            }
            
            is.close();
        } catch (FileNotFoundException ex) {
            this.displayErrorDialog("Problem opening file: " + ex.getMessage());
        } catch (IOException e) {
            this.displayErrorDialog("Unknown IOException while processing file: "+e.getMessage());
        }

        rowsValueLabel.setText(numRows.toString());
    }
    
    private int getSpeedOverrideValue() {
        int ret = -1;
        if (this.overrideSpeedCheckBox.isSelected()) {
            ret = Integer.parseInt( this.overrideSpeedValueSpinner.getValue().toString() );
        }
        return ret;
    }
    
    private String getNewline() {
        if (lineBreakNR.isSelected())
            return "\n\r";
        else if (lineBreakRN.isSelected())
            return "\r\n";
        else if (lineBreakN.isSelected())
            return "\n";
        else
            return "wtfbbq";
    }

    private void closeCommConnection() {
        this.commPort.closeCommPort();
        this.updateControlsForComm(false);
        this.consoleTextArea.append("\n**** Connection closed ****");

    }
    
    private void displayErrorDialog(String errorMessage) {
        JOptionPane.showMessageDialog(new JFrame(), errorMessage, "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    /** SerialCommunicatorListener implementation.
     */
    
    @Override
    public void fileStreamComplete(String filename, boolean success) {
        this.updateControlsForSend(false);
        if (success) {
            JOptionPane.showMessageDialog(new JFrame(), "Job complete.", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            displayErrorDialog("Job completed with error.");
        }
    }
     
    @Override
    public void commandComplete(String command, String response) {
        Integer i = Integer.parseInt(this.sentRowsValueLabel.getText()) + 1;
        this.sentRowsValueLabel.setText(i.toString());
    }
    
    @Override
    public String preprocessCommand(String command) {
        Integer overrideSpeed = this.getSpeedOverrideValue();
        String newCommand = command;
        
        if (overrideSpeed > 0) {
            // Check if command sets feed speed.
            int index = command.toLowerCase().indexOf('f');
            if (index > 0) {
                int indexSpaceAfterF = command.indexOf(" ", index+1);
                // Build that new command.
                newCommand = (new StringBuilder()
                        .append(command.substring(0, index+1))
                        .append(overrideSpeed.toString())
                        .append(".0")
                        .append(command.substring(indexSpaceAfterF))
                        ).toString();
                
                System.out.println("New command: "+newCommand);
            }
        }
        return newCommand;
    }

    @Override
    public void messageForConsole(String msg) {
        this.consoleTextArea.append(msg);
    }
    
    // My Variables
    private javax.swing.JFileChooser fileChooser;
    private java.io.File gcodeFile;
    private SerialCommunicator commPort;
    private List<String> commandList;
    
    // Generated variables.
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox commPortComboBox;
    private javax.swing.JLabel commandLabel;
    private javax.swing.JTextField commandTextField;
    private javax.swing.JTextArea consoleTextArea;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JTextField fileTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup lineBreakGroup;
    private javax.swing.JRadioButton lineBreakN;
    private javax.swing.JRadioButton lineBreakNR;
    private javax.swing.JRadioButton lineBreakRN;
    private javax.swing.JButton openButton;
    private javax.swing.JCheckBox overrideSpeedCheckBox;
    private javax.swing.JSpinner overrideSpeedValueSpinner;
    private javax.swing.JButton printButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel rowsLabel;
    private javax.swing.JLabel rowsValueLabel;
    private javax.swing.JCheckBox scrollWindowCheckBox;
    private javax.swing.JLabel sentRowsLabel;
    private javax.swing.JLabel sentRowsValueLabel;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
