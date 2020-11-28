import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Factura {
	public static DateFormat df = new SimpleDateFormat("dd-mm-yyyy");

	public static Factura getFactura(int index) {
		Factura f = null;
		try {
			if (index == 1)
				f = new Factura(12, "dell", "uvt", df.parse("12-02-2013"),
						2000.0);
			else if (index == 2)
				f = new Factura(1, "sun", "uvt", df.parse("15-02-2010"), 1000.0);
			else
				f = new Factura(124, "dell", "upt", df.parse("13-06-2000"),
						200.0);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return f;
	}

	private long id;
	private int nrFactura;

	private String furnizor = null;
	private String client = null;
	private Date data;
	private double suma;

	public Factura() {

	}

	@Override
	public String toString() {
		return "Factura [nrFactura=" + nrFactura + ", furnizor=" + furnizor
				+ ", client=" + client + ", data=" + df.format(data)
				+ ", suma=" + suma + "]";
	}

	public Factura(int nrFactura, String furnizor, String client, Date data,
			double suma) {
		super();
		this.nrFactura = nrFactura;
		this.furnizor = furnizor;
		this.client = client;
		this.data = data;
		this.suma = suma;
	}

	public int getNrFactura() {
		return nrFactura;
	}

	public void setNrFactura(int nrFactura) {
		this.nrFactura = nrFactura;
	}

	public String getFurnizor() {
		return furnizor;
	}

	public void setFurnizor(String furnizor) {
		this.furnizor = furnizor;
	}

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getSuma() {
		return suma;
	}

	public void setSuma(double suma) {
		this.suma = suma;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
