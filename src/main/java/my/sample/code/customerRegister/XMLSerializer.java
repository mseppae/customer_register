package my.sample.code.customerRegister;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.simpleframework.xml.Serializer;
import org.simpleframework.xml.core.Persister;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class XMLSerializer {

    private File source;
    private Serializer serializer = new Persister();
    private CustomerRegister newRegister;

    public XMLSerializer() {
        newRegister = new CustomerRegister();
        source = new File("customers.xml");
        if (! source.exists()) {
        	try {
			    FileWriter fstream = new FileWriter("customers.xml");
		        BufferedWriter out = new BufferedWriter(fstream);
		        out.write("<customers></customers>");
			    out.close();
			} catch (IOException ex) {
				Logger.getLogger(XMLSerializer.class.getName()).log(Level.SEVERE, null, ex);
			}
        }
    }

    public void serializeXML(CustomerRegister aRegister) {
        writeXML(aRegister);
    }

    public CustomerRegister unserializeXML() {
        return readXML();
    }

    public void setFile(String fileName) {
        source = new File(fileName);
    }

    public File getFile() {
        return source;
    }

    private void writeXML(CustomerRegister aRegister) {
        try {
            serializer.write(aRegister, source);
        } catch (Exception ex) {
            Logger.getLogger(XMLSerializer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private CustomerRegister readXML() {
        try {
            newRegister = serializer.read(CustomerRegister.class, source);
        } catch (Exception ex) {
            Logger.getLogger(XMLSerializer.class.getName()).log(Level.SEVERE, null, ex);
        }
        return newRegister;
    }
}
