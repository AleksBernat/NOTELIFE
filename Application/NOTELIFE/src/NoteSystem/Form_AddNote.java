//package NoteSystem;
//
//import static NoteSystem.NoteSystem.defaultPath;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.io.File;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.io.PrintStream;
//import java.text.SimpleDateFormat;
//import java.util.Calendar;
//import javax.swing.Box;
//import javax.swing.BoxLayout;
//import javax.swing.JButton;
//import javax.swing.JDialog;
//import javax.swing.JFileChooser;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JTextField;
//import javax.swing.WindowConstants;
//import javax.swing.border.EmptyBorder;
//
//public class Form_AddNote extends JDialog {
//
//    NoteSystem mainForm;
//
//    public Form_AddNote(NoteSystem mainForm) {
//        super();
//        this.mainForm = mainForm;
//        genGUI();
//    }
//
//    public void genGUI() {
//        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
//        setSize(400, 300);
//        setTitle("Add Note");
//
//        //Error labels
//        final JLabel selectErrorLabel = new JLabel(" ") {
//            {
//                setFont(new Font("Arial", Font.PLAIN, 14));
//                setForeground(Color.RED);
//            }
//        };
//        final JLabel titleErrorLabel = new JLabel(" ") {
//            {
//                setFont(new Font("Arial", Font.PLAIN, 14));
//                setForeground(Color.RED);
//            }
//        };
//        final JLabel descriptionErrorLabel = new JLabel(" ") {
//            {
//                setFont(new Font("Arial", Font.PLAIN, 14));
//                setForeground(Color.RED);
//            }
//        };
//
//
//        JPanel contentPanel = (JPanel) getContentPane();
//        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
//        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
//
//        //Panel for the title
//        JPanel titlePanel = new JPanel();
//        titlePanel.setLayout(new BoxLayout(titlePanel, BoxLayout.X_AXIS));
//
//        final JLabel titleLabel = new JLabel("Add a New Note");
//        titleLabel.setFont(new Font("Arial", Font.BOLD, 20));
//        titlePanel.add(titleLabel);
//
//        //Empty Panel for spacing
//        JPanel spacerPanel = new JPanel();
//        spacerPanel.setLayout(new BoxLayout(spacerPanel, BoxLayout.X_AXIS));
//        JLabel blankLabel = new JLabel(" ");
//        spacerPanel.add(blankLabel);
//
//        //Panel with file selector
//        JPanel selectFilePanel = new JPanel();
//        selectFilePanel.setLayout(new BoxLayout(selectFilePanel, BoxLayout.X_AXIS));
//
//        String filename = File.separator + "tmp";
//        final JFileChooser fileChooser = new JFileChooser(new File(filename));
//
//
//
//        //Panel for the title of the note
//        JPanel noteTitlePanel = new JPanel() {
//            @Override
//            public Dimension getMaximumSize() {
//                Dimension max = super.getMaximumSize();
//                max.height = getPreferredSize().height;
//                return max;
//            }
//        };
//        noteTitlePanel.setLayout(new BoxLayout(noteTitlePanel, BoxLayout.X_AXIS));
//
//        final JLabel noteTitleLabel = new JLabel("Title:  ");
//        noteTitlePanel.add(noteTitleLabel);
//
//        noteTitlePanel.add(Box.createRigidArea(new Dimension(90, 2)));
//
//        final JTextField noteTitleField = new JTextField("");
//        noteTitlePanel.add(noteTitleField);
//
//        //Panel for the description of the note
//        JPanel noteDescriptionPanel = new JPanel() {
//            @Override
//            public Dimension getMaximumSize() {
//                Dimension max = super.getMaximumSize();
//                max.height = getPreferredSize().height;
//                return max;
//            }
//        };
//        noteDescriptionPanel.setLayout(new BoxLayout(noteDescriptionPanel, BoxLayout.X_AXIS));
//
//        final JLabel noteDescriptionLabel = new JLabel("Description:  ");
//        noteDescriptionPanel.add(noteDescriptionLabel);
//
//        noteDescriptionPanel.add(Box.createRigidArea(new Dimension(50, 2)));
//
//        final JTextField noteDescriptionField = new JTextField("");
//        noteDescriptionPanel.add(noteDescriptionField);
//
//
//        //Panel for the 2 buttons
//        JPanel buttonPanel = new JPanel();
//        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));
//
//        JButton addButton = new JButton("Add");
//        addButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                boolean error = false;
///*
//                //Checking file selector errors
//       //         if (fileChooser.getSelectedFiles().length == 0) {
//       //             error = true;
//       //             selectErrorLabel.setText("Please select a file.");
//                } else {
//                    for (int i = 0; i < fileChooser.getSelectedFiles().length; i++) {
//                        if (!mainForm.extensionAllowed(fileChooser.getSelectedFiles()[i])) {
//                            error = true;
//                        }
//                    }
//                    if (error) {
//                        error = true;
//                        selectErrorLabel.setText("File Extension Error");
//                    }
//                }
//
//                if (!error) {
//                    selectErrorLabel.setText(" ");
//                }
//*/
//                //Checking title error
//                if (noteTitleField.getText() == null || noteTitleField.getText().length() == 0) {
//                    error = true;
//                    titleErrorLabel.setText("Please enter a title.");
//                } else if (new File(defaultPath + "/" + noteTitleField.getText()).exists()) {
//                    error = true;
//                    titleErrorLabel.setText("A note with this title exists! Please choose a new title!");
//                } else {
//                    titleErrorLabel.setText(" ");
//                }
//
//                //Checking description error
//                if (noteDescriptionField.getText() == null || noteDescriptionField.getText().length() == 0) {
//                    error = true;
//                    descriptionErrorLabel.setText("Please enter a description.");
//                } else {
//                    descriptionErrorLabel.setText(" ");
//                }
//
//                if (!error) {
//                    File newFolder = new File(defaultPath + "/" + noteTitleField.getText());
//                    newFolder.mkdir();
//                    File noteInfo = new File(newFolder + "/data.info");
//                    try {
//                        noteInfo.createNewFile();
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//                   try {
//     /*                    for (int i = 0; i < fileChooser.getSelectedFiles().length; i++) {
//                            File originalFile = fileChooser.getSelectedFiles()[i];
//
//                            File destinationFile = new File(newFolder + "/" + originalFile.getName());
//                            mainForm.copyFile(originalFile, destinationFile);
//                        }
//    */
//                        Calendar currentDate = Calendar.getInstance();
//                        SimpleDateFormat formatter = new SimpleDateFormat("yyyy.MM.dd h:mm a");
//                        String todaysDate = formatter.format(currentDate.getTime());
//
//                        PrintStream infoPrinter = new PrintStream(noteInfo);
//                        infoPrinter.println("**Please do not modify or delete this file.");
//                        infoPrinter.println("**Settings may be modified in the settings menu of the application.");
//                        infoPrinter.println("Title=" + noteTitleField.getText());
//                        infoPrinter.println("Description=" + noteDescriptionField.getText());
//                       // infoPrinter.println("Tags=" + noteTagsField.getText());
//                        infoPrinter.println("Date=" + todaysDate);
//                        infoPrinter.println("Size=" + mainForm.noteList.noteSize(newFolder));
//                        infoPrinter.close();
//
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }
//
//                    Form_NoteAdded noteAdded = new Form_NoteAdded(mainForm, "Added");
//                    dispose();
//
//                }
//            }
//        });
//        buttonPanel.add(addButton);
//
//        buttonPanel.add(Box.createRigidArea(new Dimension(30, 30)));
//
//        JButton cancelButton = new JButton("Cancel");
//        cancelButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent ae) {
//                dispose();
//            }
//        });
//        buttonPanel.add(cancelButton);
//
//        JPanel selectError = new JPanel();
//        selectError.setLayout(new BoxLayout(selectError, BoxLayout.X_AXIS));
//        selectError.add(selectErrorLabel);
//        selectError.add(Box.createHorizontalGlue());
//
//        JPanel titleError = new JPanel();
//        titleError.setLayout(new BoxLayout(titleError, BoxLayout.X_AXIS));
//        titleError.add(titleErrorLabel);
//        titleError.add(Box.createHorizontalGlue());
//
//        JPanel descriptionError = new JPanel();
//        descriptionError.setLayout(new BoxLayout(descriptionError, BoxLayout.X_AXIS));
//        descriptionError.add(descriptionErrorLabel);
//        descriptionError.add(Box.createHorizontalGlue());
//
//
//        //Add everything to our contentPanel (Master Panel)
//        contentPanel.add(titlePanel);
//        contentPanel.add(Box.createRigidArea(new Dimension(15, 15)));
//        contentPanel.add(selectFilePanel);
//        contentPanel.add(selectError);
//        contentPanel.add(noteTitlePanel);
//        contentPanel.add(titleError);
//        contentPanel.add(noteDescriptionPanel);
//        contentPanel.add(descriptionError);
//
//        contentPanel.add(buttonPanel);
//        setModal(true);
//        setVisible(true);
//    }
//}
package NoteSystem;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;


public class Form_AddNote extends JDialog{
    NoteSystem mainForm;
    public Form_AddNote(NoteSystem mainForm){
        super();
        this.mainForm = mainForm;
        genGUI();
    }

    public void genGUI()
    {
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(500, 200);
        setTitle("Create New Note");

        JPanel contentPanel = (JPanel) getContentPane();
        contentPanel.setBorder(new EmptyBorder(0, 0, 0, 0));
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));


        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.X_AXIS));

        final JTextArea textArea = new JTextArea();
        textArea.setBorder(BorderFactory.createLineBorder(Color.black));
        textPanel.add(textArea);


        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.X_AXIS));

        final JButton saveButton = new JButton("Save");
        saveButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                String[] textList = textArea.getText().split("\\r?\\n");//regex
                if(textList.length != 0){
                    Form_CreateNoteTitleDesc form = new Form_CreateNoteTitleDesc(mainForm, textList);
                    if(form.added)
                        dispose();
                }
            }

        });
        buttonPanel.add(saveButton);

        final JButton cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
            }

        });
        buttonPanel.add(Box.createRigidArea(new Dimension(30, 30)));
        buttonPanel.add(cancelButton);

        contentPanel.add(textPanel);
        contentPanel.add(Box.createRigidArea(new Dimension(10, 10)));
        contentPanel.add(buttonPanel);
        contentPanel.add(Box.createRigidArea(new Dimension(5, 5)));

        setModal(true);
        setVisible(true);
    }
}
