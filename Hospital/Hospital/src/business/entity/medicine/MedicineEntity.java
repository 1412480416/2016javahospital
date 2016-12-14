package business.entity.medicine;

public class MedicineEntity {
	/**ID*/
	private String id;
	/**药品名称*/
	private String name;
	/**药品单价*/
	private float price;
	/**计费方式：1.片；2.ml*/
	private Integer methods;
	/**药品是否有效：0.无效；1.有效*/
	private Integer isEnabled;
	/**药品信息上次更新时间*/
	private String updateTime;
	/**药品规格：片/盒；ml/盒*/
	private Integer norms;
	/**库存量*/
	private Integer num;
	/**散装库存量*/
	private float specNum;
	/**备注*/
	private String comm;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Integer getMethods() {
		return methods;
	}
	public void setMethods(Integer methods) {
		this.methods = methods;
	}
	public Integer getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(Integer isEnabled) {
		this.isEnabled = isEnabled;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	public Integer getNorms() {
		return norms;
	}
	public void setNorms(Integer norms) {
		this.norms = norms;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public float getSpecNum() {
		return specNum;
	}
	public void setSpecNum(float specNum) {
		this.specNum = specNum;
	}
	public String getComm() {
		return comm;
	}
	public void setComm(String comm) {
		this.comm = comm;
	}
//	public MedicineEntity() {
//		super();
//	}

}
