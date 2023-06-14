package package_lab4;

import java.awt.Color;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class QLNV extends javax.swing.JFrame {

	// Khởi tạo giao diện và hiển thị cửa sổ QLNV
	public QLNV() {
		initComponents();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		titleQLNV = new javax.swing.JLabel();
		jLabelHoVaTen = new javax.swing.JLabel();
		jLabelNgaySinh = new javax.swing.JLabel();
		jLabelLuong = new javax.swing.JLabel();
		txtHoTen = new javax.swing.JTextField();
		txtDate = new javax.swing.JTextField();
		txtSalary = new javax.swing.JTextField();
		btnKiemTra = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		titleQLNV.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
		titleQLNV.setText("QUẢN LÝ NHÂN VIÊN");

		jLabelHoVaTen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelHoVaTen.setText("HỌ VÀ TÊN");

		jLabelNgaySinh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelNgaySinh.setText("NGÀY SINH");

		jLabelLuong.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
		jLabelLuong.setText("LƯƠNG");

		btnKiemTra.setBackground(new java.awt.Color(0, 204, 255));
		btnKiemTra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
		btnKiemTra.setText("KIỂM TRA");
		btnKiemTra.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btnValidateActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup()
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup().addContainerGap()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(jLabelHoVaTen).addComponent(jLabelNgaySinh).addComponent(jLabelLuong))
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 342,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 342,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 342,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(btnKiemTra)))
						.addGroup(layout.createSequentialGroup().addGap(140, 140, 140).addComponent(titleQLNV)))
				.addContainerGap(93, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addGap(25, 25, 25).addComponent(titleQLNV).addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabelHoVaTen).addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabelNgaySinh).addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
						.addComponent(jLabelLuong).addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, 30,
								javax.swing.GroupLayout.PREFERRED_SIZE))
				.addGap(18, 18, 18).addComponent(btnKiemTra, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addContainerGap(34, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	// Hàm xử lý sự kiện khi nhấn nút "KIỂM TRA"
	private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {
		// Kiểm tra và xử lý dữ liệu nhập vào
		boolean ok = true;
		if (ok) {
			StringBuilder sb = new StringBuilder();
			valFields(sb);
			valDate(sb);
			valSalary(sb);
			if (sb.length() > 0) {
				JOptionPane.showMessageDialog(this, sb.toString(), "Thông báo", JOptionPane.ERROR_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(this, "Bạn đã nhập đúng!");
		}
	}

	// Hàm kiểm tra dữ liệu nhập vào cho các trường dữ liệu
	private void valFields(StringBuilder sb) {
		if (txtHoTen.getText().equals("")) {
			txtHoTen.setBackground(Color.yellow);
			txtDate.requestFocus();
			sb.append("Họ và tên không được để trống!\n");
		} else {
			txtHoTen.setBackground(Color.white);
		}
		if (txtDate.getText().equals("")) {
			txtDate.setBackground(Color.yellow);
			txtDate.requestFocus();
			sb.append("Ngày sinh không được để trống!\n");
		} else {
			txtDate.setBackground(Color.white);
		}
		if (txtSalary.getText().equals("")) {
			txtSalary.setBackground(Color.yellow);
			txtSalary.requestFocus();
			sb.append("Lương không được để trống!\n");
		} else {
			txtSalary.setBackground(Color.white);
		}
	}

	// Hàm kiểm tra dữ liệu nhập vào cho trường lương
	private void valSalary(StringBuilder sb) {
		try {
			double salary = Double.parseDouble(txtSalary.getText());
			if (salary < 0) {
				txtSalary.setBackground(Color.yellow);
				sb.append("Lương phải lớn hơn 0!\n");
			} else {
				txtSalary.setBackground(Color.white);
			}
		} catch (NumberFormatException ex) {
			txtSalary.setBackground(Color.yellow);
			sb.append("không đúng định dạng số!\n");
		}
	}

	// Hàm kiểm tra dữ liệu nhập vào cho trường ngày sinh
	private void valDate(StringBuilder sb) {
		if (txtDate.getText().equals("")) {
			return;
		}
		SimpleDateFormat formater = new SimpleDateFormat();
		formater.applyPattern("dd-MM-yyyy");
		try {
			formater.parse(txtDate.getText());
			txtDate.setBackground(Color.white);
		} catch (ParseException ex) {
			txtDate.setBackground(Color.yellow);
			sb.append("Ngày sinh sai định dạng (dd-MM-yyyy)\n");
		}
	}

	// Phương thức main để khởi tạo và hiển thị cửa sổ QLNV
	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(QLNV.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// Thiết lập giao diện và hiển thị cửa sổ QLNV
		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new QLNV().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton btnKiemTra;
	private javax.swing.JLabel titleQLNV;
	private javax.swing.JLabel jLabelHoVaTen;
	private javax.swing.JLabel jLabelNgaySinh;
	private javax.swing.JLabel jLabelLuong;
	private javax.swing.JTextField txtDate;
	private javax.swing.JTextField txtHoTen;
	private javax.swing.JTextField txtSalary;
	// End of variables declaration//GEN-END:variables
}