package business.service.medicine;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.entity.medicine.MedicineEntity;
import test.MySQLHelper;

public class MedicineService {
	
	/**
	 * 增加
	 */
	public void AddMedicineDao(MedicineEntity medicineEntity) {
		String sql = "INSERT INTO t_medicine (id, name, price, methods, isEnabled, updateTime, norms, num, specNum, comm) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		String[] parameters = {medicineEntity.getId(), medicineEntity.getName(), Float.toString(medicineEntity.getPrice()), Integer.toString(medicineEntity.getMethods()), Integer.toString(medicineEntity.getIsEnabled()), medicineEntity.getUpdateTime(), Integer.toString(medicineEntity.getNorms()), Integer.toString(medicineEntity.getNum()), Float.toString(medicineEntity.getSpecNum()), medicineEntity.getComm()};
		MySQLHelper.executeUpdate(sql, parameters);
	}
	
//	public void Add
	
	/**
	 * 删除
	 */
	public void DelMedicineDao (String id) {
//		String sql = "DELETE FROM t_medicine WHERE id = ?";
		String sql = "UPDATE t_medicine SET isEnabled = 0 WHERE id = ?";
		String[] parameters = {id};
		MySQLHelper.executeUpdate(sql, parameters);
	}
	
	public void DelMedicineDao (MedicineEntity medicineEntity) {
//		String sql = "DELETE FROM t_medicine WHERE id = ?";
		String sql = "UPDATE t_medicine SET isEnabled = 0 WHERE id = ?";
		String[] parameters = {medicineEntity.getId()};
		MySQLHelper.executeQuery(sql, parameters);
	}
	
	/**
	 * 更新
	 */
	public void UpdateMedicineDao (MedicineEntity medicineEntity) {
		String sql = "UPDATE t_medicine SET name = ?, price = ?, methods = ?, isEnbaled = ?, updateTime = ?, norms = ?, num = ?, specNum = ?, comm = ? WHERE id = ? AND isEnabled = 1";
		String[] parameters = {medicineEntity.getName(), Float.toString(medicineEntity.getPrice()), Integer.toString(medicineEntity.getMethods()), Integer.toString(medicineEntity.getIsEnabled()), medicineEntity.getUpdateTime(), Integer.toString(medicineEntity.getNorms()), Integer.toString(medicineEntity.getNum()), Float.toString(medicineEntity.getSpecNum()), medicineEntity.getComm(), medicineEntity.getId() };
		MySQLHelper.executeUpdate(sql, parameters);
	}
	
	/**
	 * 查找
	 */
	public MedicineEntity FindMedicineDao1 (String id) {
		String sql = "SELECT * FROM t_medicine WHERE isEnable = 1 AND ID = ? ";
		String[] parameters = {id};
		ResultSet rs = MySQLHelper.executeQuery(sql, parameters);
		
		MedicineEntity medicineEntity = new MedicineEntity();
		medicineEntity.setId(id);
		try {
			while(rs.next()) {
				medicineEntity.setName(rs.getString("name"));
				medicineEntity.setPrice(rs.getFloat("price"));
				medicineEntity.setMethods(rs.getInt("methos"));
				medicineEntity.setIsEnabled(rs.getInt("isEnable"));
				medicineEntity.setUpdateTime(rs.getString("updateTime"));
				medicineEntity.setNorms(rs.getInt("norms"));
				medicineEntity.setNum(rs.getInt("num"));
				medicineEntity.setSpecNum(rs.getFloat("specNum"));
				medicineEntity.setComm(rs.getString("comm"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return medicineEntity;

	}
	
//	public List<MedicineEntity> FindMedicineDao (String id) {
//		String sql = "SELECT * FROM t_medicine WHERE isEnable = 1 AND ID = ?";
//		String[] parameters = {id};
//		ResultSet rs = MySQLHelper.executeQuery(sql, parameters);
//		List<MedicineEntity> list = new ArrayList();
//		try {
//			while(rs.next()) {
//				MedicineEntity medicineEntity = new MedicineEntity();
//				medicineEntity.setId(id);
//				medicineEntity.setName(rs.getString("name"));
//				medicineEntity.setPrice(Float.parseFloat(rs.getString("price")));
//				medicineEntity.setMethods(Integer.getInteger(rs.getString("methos")));
//				medicineEntity.setIsEnabled(Integer.getInteger(rs.getString("isEnable")));
//				medicineEntity.setUpdateTime(rs.getString("updateTime"));
//				medicineEntity.setNorms(Integer.getInteger(rs.getString("norms")));
//				medicineEntity.setNum(Integer.getInteger(rs.getString("num")));
//				medicineEntity.setSpecNum(Float.parseFloat(rs.getString("specNum")));
//				medicineEntity.setComm(rs.getString("comm"));
//				
//				list.add(medicineEntity);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return list;
//	}
	
	/**
	 * 显示所有
	 */
	public List<MedicineEntity> ListAll () {
//		String sql = "SELECT * FROM t_medicine WHERE isEnable = 1?";
		String sql = "SELECT * FROM t_medicine";
		List<MedicineEntity> list = new ArrayList();
		try {
			ResultSet rs = MySQLHelper.executeQuery(sql, null);
			while(rs.next()) {
				MedicineEntity medicineEntity = new MedicineEntity();
				medicineEntity.setId(rs.getString("id"));
				medicineEntity.setName(rs.getString("name"));
				medicineEntity.setPrice(rs.getFloat("price"));
				medicineEntity.setMethods(rs.getInt("methods"));
				medicineEntity.setIsEnabled(rs.getInt("isEnabled"));
				medicineEntity.setUpdateTime(rs.getString("updateTime"));
				medicineEntity.setNorms(rs.getInt("norms"));
				medicineEntity.setNum(rs.getInt("num"));
				medicineEntity.setSpecNum(rs.getFloat("specNum"));
				medicineEntity.setComm(rs.getString("comm"));
				
//				System.out.println(rs.getString("id") + "\t" + rs.getString("name") + "\t" + rs.getString("price") + "\t" + rs.getString("methods") + "\t" + rs.getString("isEnabled") + "\t" + rs.getString("updateTime") + "\t" + rs.getString("norms") + "\t" + rs.getString("num") + "\t" + rs.getString("specNum") + "\t" + rs.getString("comm") );
				
				list.add(medicineEntity);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
}
