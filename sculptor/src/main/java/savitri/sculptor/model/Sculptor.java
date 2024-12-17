package savitri.sculptor.model;

	import java.util.Set;
	import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

	@Entity
	public class Sculptor {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String Sculptorname,duration,price;

	@ManyToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinTable(name="Sculptor_images",joinColumns= {
			
	@JoinColumn(name="id")
	}
	)
	private Set<ImageModel> SculptorImages;



	public Set<ImageModel> getSculptorImages() {
		return SculptorImages;
	}
	public void setSculptorImages(Set<ImageModel> SculptorImages) {
		this.SculptorImages = SculptorImages;
	}
	public Sculptor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Sculptor(String Sculptorname, String duration, String price) {
		super();
		this.Sculptorname = Sculptorname ;
		this.duration = duration;
		this.price = price;
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getSculptorname() {
		return Sculptorname;
	}
	public void setSculptorname(String Sculptorname) {
		this.Sculptorname  = Sculptorname ;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getprice() {
		return price;
	}
	public void setprice(String price) {
		this.price = price;
	}



	}

