import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.FlowLayout;

public class AddressBook extends JFrame{
	
	private JTextField firstName = new JTextField(); 
	private JTextField lastName = new JTextField();
	private JTextField email = new JTextField();
	private JRadioButton workContact = new JRadioButton("Work Contact");
	private JRadioButton personalContact = new JRadioButton("Personal Contact");
	private ButtonGroup contactType = new ButtonGroup();
	private JLabel recordIndicator =new JLabel("record # of #");
	private JButton firstJButton = new JButton("First");
	private JButton previousJButton = new JButton("Previous");
	private JButton nextJButton = new JButton("Next");
	private JButton lastJButton = new JButton("Last");
	private JButton addJButton = new JButton("Add");
	private JButton editJButton = new JButton("Edit");
	private JButton deleteJButton = new JButton("Delete");
	private JButton cancelJButton = new JButton("Cancel");
	private JButton saveJButton = new JButton("Save");

	public AddressBook(){
		
		//Labels Panel
		JPanel lblPanel =new JPanel(new GridLayout(4,1));
		lblPanel.add(new JLabel("First Name"));
		lblPanel.add(new JLabel("Last Name"));
		lblPanel.add(new JLabel("Email"));
		lblPanel.add(new JLabel("Contact Type"));
		
		//RadioButtons
		contactType.add(workContact);
		contactType.add(personalContact);
		JPanel radioBtnPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		radioBtnPanel.add(workContact);
		radioBtnPanel.add(personalContact);
		
		//Controls Area
		JPanel controlsPnl = new JPanel(new GridLayout(4,1));
		controlsPnl.add(firstName);
		controlsPnl.add(lastName);
		controlsPnl.add(email);
		controlsPnl.add(radioBtnPanel);
		
		// Navigation Buttons
		JPanel navigationButtonsPanel = new JPanel(new GridLayout(1, 5));
		navigationButtonsPanel.add(firstJButton);
		navigationButtonsPanel.add(previousJButton);
		navigationButtonsPanel.add(recordIndicator);
		navigationButtonsPanel.add(nextJButton);
		navigationButtonsPanel.add(lastJButton);

		// Data Manipulation Buttons
		JPanel dataManipulationButtonsPanel = new JPanel(new GridLayout(1, 5));
		dataManipulationButtonsPanel.add(addJButton);
		dataManipulationButtonsPanel.add(editJButton);
		dataManipulationButtonsPanel.add(deleteJButton);
		dataManipulationButtonsPanel.add(cancelJButton);
		dataManipulationButtonsPanel.add(saveJButton);
		
		JPanel buttonsPanel = new JPanel(new GridLayout(2, 1));
		buttonsPanel.add(navigationButtonsPanel);
		buttonsPanel.add(dataManipulationButtonsPanel);
		
		// Assemble the GUI
		JPanel addressBookPanel = new JPanel(new BorderLayout());
		addressBookPanel.add(lblPanel, BorderLayout.WEST);
		addressBookPanel.add(controlsPnl, BorderLayout.CENTER);
		addressBookPanel.add(buttonsPanel, BorderLayout.SOUTH);
		this.getContentPane().add(addressBookPanel, BorderLayout.CENTER);
		
		this.setTitle("Address Book");
		this.setIconImage(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
				


	}
	

}
