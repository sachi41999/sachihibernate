package hiber.sachiHibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Student_Address")
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Student_Id")
	private int id;
	
	private String street;
	
	private String city;
	
	private String state;
	
	@Column(name="pinCode")
	private int pin;
	
	@Temporal(TemporalType.DATE)
	@Column(name="added_date")
	private Date added;
	
	@Transient
	private double roadnumber;
	
	@Lob
	private byte[] image;

	public Address(int id, String street, String city, String state, int pin, Date added, double roadnumber,
			byte[] image) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.pin = pin;
		this.added = added;
		this.roadnumber = roadnumber;
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Date getAdded() {
		return added;
	}

	public void setAdded(Date added) {
		this.added = added;
	}

	public double getRoadnumber() {
		return roadnumber;
	}

	public void setRoadnumber(double roadnumber) {
		this.roadnumber = roadnumber;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	

}
