package jp.co.sample.emp_management.form;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 従業員情報更新時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class UpdateEmployeeForm {
	/** id */
	private String id;
	/** 扶養人数 */
	@Pattern(regexp = "^[0-9]+$", message = "扶養人数は数値で入力してください")
	private String dependentsCount;
	
	
	@NotBlank(message="名前は必須です")
	@Size(max = 20)
	private String name;
	
	@NotBlank(message="性別の入力は必須です")
	private String gender;
	
	@DateTimeFormat(pattern="yyy-MM-dd")
	private Date hireDate;
	
	@NotBlank(message="メールアドレスは必須です")
	@Size(max = 50)
	private String mailAddress;
	
	@Pattern(regexp="^[0-9]+$",message="郵便番号は必須です")
	private String zipCode;
	
	@NotBlank(message="住所の入力は必須です")
	@Size(max = 100)
	private String address;
	
	@Pattern(regexp = "^[0-9]{1}[0-9¥-]{1,13}[0-9]{1}$",message="電話番号を正しく入力してください")
	private String telephone;
	
	@NotNull(message="給料を入力してください")
	@Range(min = 0,max = 1000000)
	private Integer salary;
	
	@NotBlank(message="特性を入力してください")
	private String characteristics;
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getCharacteristics() {
		return characteristics;
	}

	public void setCharacteristics(String characteristics) {
		this.characteristics = characteristics;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * IDを数値として返します.
	 * 
	 * @return 数値のID
	 */
	public Integer getIntId() {
		return Integer.parseInt(id);
	}

	/**
	 * 扶養人数を数値として返します.
	 * 
	 * @return 数値の扶養人数
	 */
	public Integer getIntDependentsCount() {
		return Integer.parseInt(dependentsCount);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDependentsCount() {
		return dependentsCount;
	}

	public void setDependentsCount(String dependentsCount) {
		this.dependentsCount = dependentsCount;
	}

	@Override
	public String toString() {
		return "UpdateEmployeeForm [id=" + id + ", dependentsCount=" + dependentsCount + ",name= " + name + ",gender=" + gender+ ",hireDate= " + hireDate + ",mailAdress=" + mailAddress + " ,zipCode=" + zipCode + ",address="  + address + ",telephone=" + telephone + ",salary=" + salary + "characteristics=" + characteristics + "]";
		
	}

}