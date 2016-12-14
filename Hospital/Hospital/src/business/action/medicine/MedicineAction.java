package business.action.medicine;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import business.entity.medicine.MedicineEntity;
import business.service.medicine.MedicineService;
import test.MySQLHelper;

public class MedicineAction {
	public void testForData() {
		MedicineService medicineService = new MedicineService();
		List<MedicineEntity> medicineList = new ArrayList();
//		medicineList = medicineService.ListAll();
		
//		System.out.println("123");
		
	}
	
}
