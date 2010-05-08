package my.sample.code.customerRegister;

import java.util.ArrayList;

@SuppressWarnings("serial")
public class CustomerGUI extends javax.swing.JFrame {
    private CustomerRegister aRegister;
    private XMLSerializer aXMLSerializer;
    private Boolean newRecord;
    private Customer selectedCustomer;

    /** Creates new form CustomerGUI */
    public CustomerGUI() {
        loadCustomerRegister();
        initComponents();
    }

    private void loadCustomerRegister() {
        aXMLSerializer = new XMLSerializer();
        aRegister = aXMLSerializer.unserializeXML();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    private void initComponents() {

        customerForm = new javax.swing.JFrame();
        formLabel = new javax.swing.JLabel();
        nameFieldLabel = new javax.swing.JLabel();
        addressFieldLabel = new javax.swing.JLabel();
        emailFieldLabel = new javax.swing.JLabel();
        phoneFieldLabel = new javax.swing.JLabel();
        notesAreaLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        addressPOBoxField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        phoneField = new javax.swing.JTextField();
        addressTypeCBox = new javax.swing.JComboBox();
        emailTypeCBox = new javax.swing.JComboBox();
        phoneTypeCBox = new javax.swing.JComboBox();
        notesArea = new javax.swing.JTextArea();
        saveButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        postaCodeFieldLabel = new javax.swing.JLabel();
        postalCodeField = new javax.swing.JTextField();
        townField = new javax.swing.JTextField();
        townFieldLabel = new javax.swing.JLabel();
        customerNewButton = new javax.swing.JButton();
        customerScrollPane = new javax.swing.JScrollPane();
        customerList = new javax.swing.JList();
        customerDeleteButton = new javax.swing.JButton();
        customerEditButton = new javax.swing.JButton();

        customerForm.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                customerFormWindowClosing(evt);
            }
        });

        formLabel.setFont(new java.awt.Font("Lucida Grande", 1, 18));
        formLabel.setLabelFor(this);
        formLabel.setText("Customer Form");

        nameFieldLabel.setText("Name");

        addressFieldLabel.setText("Address");

        emailFieldLabel.setText("E-mail");

        phoneFieldLabel.setText("Phone");

        notesAreaLabel.setText("Notes");

        addressTypeCBox.setModel(new javax.swing.DefaultComboBoxModel(Address.getTypes()));

        emailTypeCBox.setModel(new javax.swing.DefaultComboBoxModel(Email.getTypes()));

        phoneTypeCBox.setModel(new javax.swing.DefaultComboBoxModel(Phone.getTypes()));

        notesArea.setColumns(20);
        notesArea.setRows(5);

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        postaCodeFieldLabel.setText("Postalcode");

        townFieldLabel.setText("Town");

        org.jdesktop.layout.GroupLayout customerFormLayout = new org.jdesktop.layout.GroupLayout(customerForm.getContentPane());
        customerForm.getContentPane().setLayout(customerFormLayout);
        customerFormLayout.setHorizontalGroup(
            customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(customerFormLayout.createSequentialGroup()
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(customerFormLayout.createSequentialGroup()
                        .add(170, 170, 170)
                        .add(formLabel))
                    .add(customerFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(nameFieldLabel)
                        .add(48, 48, 48)
                        .add(nameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 283, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(customerFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(customerFormLayout.createSequentialGroup()
                                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(townFieldLabel)
                                    .add(notesAreaLabel)
                                    .add(postaCodeFieldLabel)
                                    .add(emailFieldLabel)
                                    .add(phoneFieldLabel)
                                    .add(addressFieldLabel))
                                .add(16, 16, 16)
                                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, notesArea)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, phoneTypeCBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, addressTypeCBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, townField)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, postalCodeField, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, addressPOBoxField)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, emailField)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, emailTypeCBox, 0, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, phoneField)
                                    .add(org.jdesktop.layout.GroupLayout.LEADING, addressField)))
                            .add(customerFormLayout.createSequentialGroup()
                                .add(108, 108, 108)
                                .add(saveButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 90, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(35, 35, 35)
                                .add(cancelButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        customerFormLayout.setVerticalGroup(
            customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(customerFormLayout.createSequentialGroup()
                .add(formLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(nameFieldLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 22, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(nameField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(addressField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(addressFieldLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addressPOBoxField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(postaCodeFieldLabel)
                    .add(postalCodeField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(townFieldLabel)
                    .add(townField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(addressTypeCBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(emailField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(emailFieldLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(emailTypeCBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(phoneField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(phoneFieldLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(phoneTypeCBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(notesAreaLabel)
                    .add(notesArea, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(customerFormLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(saveButton)
                    .add(cancelButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        postaCodeFieldLabel.getAccessibleContext().setAccessibleName("Postal Code");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customers");
        setName("customerFrame"); // NOI18N

        customerNewButton.setText("New");
        customerNewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerNewButtonActionPerformed(evt);
            }
        });

        customerList.setModel(new javax.swing.AbstractListModel() {
            ArrayList<Customer> customers = aRegister.customerList();
            public int getSize() { return customers.size(); }
            public Object getElementAt(int i) { return customers.get(i).getName(); }
        });
        customerList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        customerScrollPane.setViewportView(customerList);

        customerDeleteButton.setText("Delete");
        customerDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerDeleteButtonActionPerformed(evt);
            }
        });

        customerEditButton.setText("Edit");
        customerEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerEditButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(customerNewButton)
                    .add(customerEditButton)
                    .add(customerDeleteButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 76, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(36, 36, 36)
                .add(customerScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(customerScrollPane, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .add(layout.createSequentialGroup()
                        .add(customerNewButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(customerDeleteButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(customerEditButton)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerNewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerNewButtonActionPerformed
        setVisible(false);
        newRecord = true;
        customerForm.setSize(400, 600);
        customerForm.setVisible(true);
    }//GEN-LAST:event_customerNewButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        clearAndDisposeForm();
        setVisible(true);
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void customerFormWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_customerFormWindowClosing
        clearAndDisposeForm();
        setVisible(true);
    }//GEN-LAST:event_customerFormWindowClosing

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        if (newRecord) {
            Customer newCustomer = populateCustomer(new Customer());
            Address newAddress = populateAddress(new Address());
            Email newEmail = populateEmail(new Email());
            Phone newPhone = populatePhone(new Phone());

            newCustomer.addressList().add(newAddress);
            newCustomer.phoneList().add(newPhone);
            newCustomer.emailList().add(newEmail);

            aRegister.customerList().add(newCustomer);
            saveAndUpdateUI();
        } else  {
            populateCustomer(selectedCustomer);
            
            Address address = selectedCustomer.addressList().get(0);
            populateAddress(address);

            Email email = selectedCustomer.emailList().get(0);
            populateEmail(email);

            Phone phone = selectedCustomer.phoneList().get(0);
            populatePhone(phone);

            saveAndUpdateUI();
        }
        clearAndDisposeForm();
        setVisible(true);
    }//GEN-LAST:event_saveButtonActionPerformed

    private Address populateAddress(Address anAddress) {
        anAddress.setPostalCode(postalCodeField.getText());
        anAddress.setStreet(addressField.getText());
        anAddress.setStreet(addressPOBoxField.getText());
        anAddress.setTown(townField.getText());
        anAddress.setType(Address.getTypes()[addressTypeCBox.getSelectedIndex()]);
        return anAddress;
    }

    private Email populateEmail(Email anEmail) {
        anEmail.setValue(emailField.getText());
        anEmail.setType(Email.getTypes()[emailTypeCBox.getSelectedIndex()]);
        return anEmail;
    }

    private Phone populatePhone(Phone aPhone) {
        aPhone.setValue(phoneField.getText());
        aPhone.setType(Phone.getTypes()[phoneTypeCBox.getSelectedIndex()]);
        return aPhone;
    }

    private Customer populateCustomer(Customer aCustomer) {
        aCustomer.setName(nameField.getText());
        aCustomer.setNote(notesArea.getText());
        return aCustomer;
    }

    private void customerDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerDeleteButtonActionPerformed
        aRegister.customerList().remove(customerList.getSelectedIndex());
        saveAndUpdateUI();
    }//GEN-LAST:event_customerDeleteButtonActionPerformed

    private void customerEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerEditButtonActionPerformed
        setVisible(false);
        newRecord = false;
        selectedCustomer = aRegister.customerList().get(customerList.getSelectedIndex());
        populateCustomerForm(selectedCustomer);
        customerForm.setSize(400, 600);
        customerForm.setVisible(true);
    }//GEN-LAST:event_customerEditButtonActionPerformed

    private void populateCustomerForm(Customer aCustomer) {
        populateCustomerFields(aCustomer);
        populateAddressFields(aCustomer);
        populateEmailFields(aCustomer);
        populatePhoneFields(aCustomer);
    }

    private void populateCustomerFields(Customer aCustomer) {
        nameField.setText(aCustomer.getName());
        notesArea.setText(aCustomer.getNote());
    }

    // TODO: For now we just use only one address, we do not
    // support multiple addresses per customer
    private void populateAddressFields(Customer aCustomer) {
        Address address = aCustomer.addressList().get(0);
        
        addressField.setText(address.getStreet());
        addressPOBoxField.setText(address.getStreetPOBox());
        postalCodeField.setText(address.getPostalCode());
        townField.setText(address.getTown());
        addressTypeCBox.setSelectedItem(address.getType());
    }
    
    // TODO: For now we just use only one email, we do not
    // support multiple emails per customer
    private void populateEmailFields(Customer aCustomer) {
        Email email = aCustomer.emailList().get(0);

        emailField.setText(email.getValue());
        emailTypeCBox.setSelectedItem(email.getType());
    }

    // TODO: For now we just use only one phone, we do not
    // support multiple phones per customer
    private void populatePhoneFields(Customer aCustomer) {
        Phone phone = aCustomer.phoneList().get(0);
        
        phoneField.setText(phone.getValue());
        phoneTypeCBox.setSelectedItem(phone.getType());
    }

    private void saveAndUpdateUI() {
        aXMLSerializer.serializeXML(aRegister);
        customerList.updateUI();
    }

    private void clearCustomerForm() {
        clearCustomerFields();
        clearAddressFields();
        clearEmailFields();
        clearPhoneFields();
    }

    private void clearAndDisposeForm() {
        clearCustomerForm();
        customerForm.dispose();
    }

    private void clearCustomerFields() {
        nameField.setText("");
        notesArea.setText("");
    }

    private void clearAddressFields() {
        addressField.setText("");
        addressPOBoxField.setText("");
        postalCodeField.setText("");
        townField.setText("");
        addressTypeCBox.setSelectedIndex(0);
    }

    private void clearEmailFields() {
        emailField.setText("");
        emailTypeCBox.setSelectedIndex(0);
    }

    private void clearPhoneFields() {
        phoneField.setText("");
        phoneTypeCBox.setSelectedIndex(0);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressField;
    private javax.swing.JLabel addressFieldLabel;
    private javax.swing.JTextField addressPOBoxField;
    private javax.swing.JComboBox addressTypeCBox;
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton customerDeleteButton;
    private javax.swing.JButton customerEditButton;
    private javax.swing.JFrame customerForm;
    private javax.swing.JList customerList;
    private javax.swing.JButton customerNewButton;
    private javax.swing.JScrollPane customerScrollPane;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailFieldLabel;
    private javax.swing.JComboBox emailTypeCBox;
    private javax.swing.JLabel formLabel;
    private javax.swing.JTextField nameField;
    private javax.swing.JLabel nameFieldLabel;
    private javax.swing.JTextArea notesArea;
    private javax.swing.JLabel notesAreaLabel;
    private javax.swing.JTextField phoneField;
    private javax.swing.JLabel phoneFieldLabel;
    private javax.swing.JComboBox phoneTypeCBox;
    private javax.swing.JLabel postaCodeFieldLabel;
    private javax.swing.JTextField postalCodeField;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField townField;
    private javax.swing.JLabel townFieldLabel;
    // End of variables declaration//GEN-END:variables

}
