/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.andom.websevice;

 
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.pdf.BarcodePDF417;
import com.onbarcode.barcode.IBarcode;
import com.onbarcode.barcode.PDF417;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author fsilva
 */
@WebService(serviceName = "MyWebService")
public class MyWebService {
private List<Codigo> lstTipo4  = new ArrayList<Codigo>();
private Codigo cod= new Codigo();

    /**
     * This is a sample web service operation
     */



    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
   
    /**
     * Web service operation
     * @param user
     * @param password
     * @param imei
     * @return 
     */
    @WebMethod(operationName = "login")
    public ObjUsuario login(@WebParam(name = "user") String user, @WebParam(name = "password") String password, @WebParam(name = "imei") String imei) {
        //TODO write your implementation code here:
        ObjPadre ojpadre = new ObjPadre();
        ObjUsuario ojuser = new ObjUsuario();
       List<ObjUsuario> lstOjuser= new ArrayList<ObjUsuario>();

        
        String var1="felipe";
        String var2="felipe";
        String var3="123456";
        if(var1.equals(user) && var2.equals(password) && var3.equals(imei)){
             ojuser.setId(1);
             ojuser.setNombre("Felipe");
             ojuser.setApellido("Felipe");
             ojuser.setRut("1-9");
             ojuser.setSession(111111);
             ojuser.setUser("felipe");
             lstOjuser.add(ojuser);
             ojpadre.setUser(lstOjuser);
            return ojuser;
        }else{
             ojuser.setId(0);
             ojuser.setNombre("No encontrado");
             ojuser.setApellido("No encontrado");
             ojuser.setRut("");
             ojuser.setSession(0);
             ojuser.setUser("No encontrado");
              lstOjuser.add(ojuser);
             ojpadre.setUser(lstOjuser);
        
        return ojuser;}
    }

     @WebMethod(operationName = "sincronizacion")
    public ObjPadre sincronizacion(@WebParam(name = "session") String session, @WebParam(name = "fechaSincronizacion") String fechaSincronizacion)   {
    try {
        //TODO write your implementation code here:
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        ObjPadre ojpadre =  new ObjPadre();
                
   if(  "123456".equals(session)){
       
   
        ObjStock objstock;
        ObjCliente objcliente;
        //List<ObjStock> lstOjStock = null;
        String var1="felipe";
        String var2="felipe";
        String var3="2015-10-05";
        String var4="123456";
        Date varr = formatoDelTexto.parse(var3);
        List<ObjCliente> lstOjcliente = new ArrayList<ObjCliente>();
        List<ObjDireccion> lstOjDireccion = new ArrayList<ObjDireccion>();
        List<ObjActividadEconomica> lstOjAct = new ArrayList<ObjActividadEconomica>();
        if( var3.equals(fechaSincronizacion)){
            ojpadre = new ObjPadre();
            objstock = new ObjStock();
            List<ObjStock> lstOjstock = new ArrayList<ObjStock>();
            objstock.setCod_bar("STOCK ACTUALIZADO");
            lstOjstock.add(objstock);
            ojpadre.setStock(lstOjstock);
            
            return ojpadre;
            
        }else{
            ojpadre = new ObjPadre();
            List<ObjStock> lstOjstock2 = new ArrayList<ObjStock>();
            objstock = new ObjStock();
            objstock.setId(1);
            objstock.setId_producto(4);
            objstock.setCod_producto("10N-ENT-NORMA");
            objstock.setDescripcion_producto("SIM CARD NORMAL COD 356");
            objstock.setStock(5);
            objstock.setPrecio_fijo(1000);
            objstock.setCod_bar("13438008336771");
            lstOjstock2.add(objstock);
            
            
            objstock = new ObjStock();
            objstock.setId(2);
            objstock.setId_producto(4);
            objstock.setCod_producto("10N-ENT-NORMA");
            objstock.setDescripcion_producto("SIM CARD NORMAL COD 356");
            objstock.setStock(5);
            objstock.setPrecio_fijo(1000);
            objstock.setCod_bar("13438008336772");
            lstOjstock2.add(objstock);
            
            
            objstock = new ObjStock();
            objstock.setId(3);
            objstock.setId_producto(4);
            objstock.setCod_producto("10N-ENT-NORMA");
            objstock.setDescripcion_producto("SIM CARD NORMAL COD 356");
            objstock.setStock(5);
            objstock.setPrecio_fijo(1000);
            objstock.setCod_bar("13438008336773");
            lstOjstock2.add(objstock);
            
            
            objstock = new ObjStock();
            objstock.setId(4);
            objstock.setId_producto(4);
            objstock.setCod_producto("10N-ENT-NORMA");
            objstock.setDescripcion_producto("SIM CARD NORMAL COD 356");
            objstock.setStock(5);
            objstock.setPrecio_fijo(1000);
            objstock.setCod_bar("13438008336774");
            lstOjstock2.add(objstock);
            
            
            objstock = new ObjStock();
            objstock.setId(5);
            objstock.setId_producto(4);
            objstock.setCod_producto("10N-ENT-NORMA");
            objstock.setDescripcion_producto("SIM CARD NORMAL COD 356");
            objstock.setStock(5);
            objstock.setPrecio_fijo(1000);
            objstock.setCod_bar("13438008336775");
            lstOjstock2.add(objstock);
            
            
            // CLIENTE 1
            lstOjcliente =new ArrayList<ObjCliente>();
            objcliente = new ObjCliente();
            objcliente.setId_cliente(1);
            objcliente.setNombre("HERMENEGILDO ZOCON HUAYLLA");
            objcliente.setRut("21.755.819-0");
            objcliente.setEstado("A");
            ObjDireccion dire ;
            ObjComuna comu ;
            ObjRegion region ;
            ObjCiudad ciu;
            /*1 primera direccion*/
            lstOjDireccion = new ArrayList<ObjDireccion>();
            dire = new ObjDireccion();
            dire.setCalle("COSTANERA SUR 2760");
            dire.setNumero("2760");
            dire.setDepartamento("2201");
            dire.setEstado("A");
            
            comu = new ObjComuna();
            comu.setId_comuna(3882);
            comu.setNombre("Las Condes");
            comu.setEstado("A");
            region = new ObjRegion();
            region.setEstado("A");
            region.setId_region(13);
            region.setNombre("RM de Santiago");
            comu.setRegion(region);
            ciu = new ObjCiudad();
            ciu.setEstado("A");
            ciu.setId_ciudad(60500);
            ciu.setNombre("Las Condes");
            ciu.setRegion(region);
            comu.setCiudad(ciu);
            dire.setId_comuna(comu);
            lstOjDireccion.add(dire);
            // ######################################
            
            /*2 Direccion*/
            dire = new ObjDireccion();
            dire.setCalle("COSTANERA Norte 2760");
            dire.setNumero("1111");
            dire.setDepartamento("2222");
            dire.setEstado("A");
            
            comu = new ObjComuna();
            comu.setId_comuna(3882);
            comu.setNombre("Las Condes");
            comu.setEstado("A");
            region = new ObjRegion();
            region.setEstado("A");
            region.setId_region(13);
            region.setNombre("RM de Santiago");
            comu.setRegion(region);
            ciu = new ObjCiudad();
            ciu.setEstado("A");
            ciu.setId_ciudad(60500);
            ciu.setNombre("Las Condes");
            ciu.setRegion(region);
            comu.setCiudad(ciu);
            dire.setId_comuna(comu);
            lstOjDireccion.add(dire);
            
            // ######################################
            
            objcliente.setLstdireccion(lstOjDireccion);
            ObjActividadEconomica act;
            
            
            act = new ObjActividadEconomica();
            act.setDescripcion("ASESORES Y CONSULTORES EN INFORMÁTICA (SOFTWARE)");
            act.setEstado("A");
            act.setId_actividad_economica(1);
            lstOjAct.add(act);
            
            act = new ObjActividadEconomica();
            act.setDescripcion("EMPRESAS DE SERVICIOS INTEGRALES DE INFORMÁTICA");
            act.setEstado("A");
            act.setId_actividad_economica(2);
            lstOjAct.add(act);
            
            objcliente.setLstactividadEconomica(lstOjAct);
            lstOjcliente.add(objcliente);
            ojpadre.setCliente(lstOjcliente);
            ojpadre.setStock(lstOjstock2);
            return ojpadre;   }
           
        }else{
        ObjUsuario ojuser = new ObjUsuario();
        List<ObjUsuario> lstOjuser= new ArrayList<ObjUsuario>();
           ojuser.setId(1);
             ojuser.setNombre("Session Expirada");
             ojuser.setApellido("Session Expirada");
             ojuser.setRut("Session Expirada");
             ojuser.setSession(0);
             ojuser.setUser("Session Expirada");
             lstOjuser.add(ojuser);
             ojpadre.setUser(lstOjuser);
            
               }
    } catch (ParseException ex) {
        Logger.getLogger(MyWebService.class.getName()).log(Level.SEVERE, null, ex);
    }
    ObjPadre ojpadre2 = null;
    return ojpadre2;
}
    
    @WebMethod(operationName = "imprimir")
    public ObjFactura imprimir (@WebParam(name = "session") String session, @WebParam(name = "ObjProducto") ObjProducto objproducto){
        
    try {
        
         if(  "123456".equals(session)&& objproducto!= null) {
                 ObjFactura objFactura = new ObjFactura();
                  BarcodePDF417 pdf417 = new BarcodePDF417();
                  String text = "Testing Java Barcode";
                  pdf417.setCodeRows(5);
                  pdf417.setCodeColumns(18);
                  pdf417.setErrorLevel(5);
                  pdf417.setOptions(BarcodePDF417.PDF417_FORCE_BINARY);
                  pdf417.setText(text.getBytes("ISO-8859-1"));
            
                  java.awt.Image img2;
                  img2 = pdf417.createAwtImage(Color.BLACK, Color.WHITE);
                  File file1 = new File("D://barraPDF417.PNG"); 
                  BufferedImage x1 = imageToBufferedImage(img2);
                  writeImageToPNG(file1,x1);
                  Image awt = (Image)x1;
                  objFactura.setTimbre(awt);
                  objFactura.setFactura(1);
                return objFactura;
        }
         else{
                return null;
         }
    } catch (UnsupportedEncodingException ex) {
        Logger.getLogger(MyWebService.class.getName()).log(Level.SEVERE, null, ex);
    } catch (Exception ex) {
        Logger.getLogger(MyWebService.class.getName()).log(Level.SEVERE, null, ex);
    }
  //   ObjImage ojpadre2 = null;
    return null;
    }
    
    @WebMethod(operationName = "inicio")
    public String inicio (@WebParam(name = "session") String session, @WebParam(name = "ObjCliente") ObjCliente objcliente){
        
   
            if(  "123456".equals(session)  && objcliente!= null){
             
                return "OK";
            }
            
            else{
                
                return "Error";
            }
    }
    
    @WebMethod(operationName = "descuento")
    public Integer descuento (@WebParam(name = "session") String session, @WebParam(name = "ObjProducto") ObjProducto objproducto ){
        
   
            if(  "123456".equals(session)  && objproducto!= null){
                  if("10N-ENT-NORMA".equals(objproducto.getCod_prod())){
                
                return 100;
                  }
            }
            
            else{
                
                return 0;
            }
            return 0;
    }
    
     @WebMethod(operationName = "existenciaCliente")
    public String existenciaCliente (@WebParam(name = "session") String session, @WebParam(name = "ObjCliente") ObjCliente objcliente ){
        
   
            if(  "123456".equals(session)  && objcliente!= null){
                  if("76001223-4".equals(objcliente.getRut())){
                  return "Rut Ya existe";
                  
                  }else{
                
                return "Debe Ingresar el Rut";}
            }
            
            else{
                
                return "Error";
            }
    }
    
   @WebMethod(operationName = "ingresoCliente")
    public String ingresoCliente (@WebParam(name = "session") String session, @WebParam(name = "ObjCliente") ObjCliente objcliente ){
        
   
            if(  "123456".equals(session)  && objcliente!= null){
                  if("76001223-4".equals(objcliente.getRut())){
                  return "Rut Ya existe";
                  
                  }else{
                
                return "Rut Ingresado";}
            }
            
            else{
                
                return "Error";
            }
    }
    
    
    @WebMethod(operationName = "ingresoEncuesta")
    public String ingresoEncuesta (@WebParam(name = "session") String session, @WebParam(name = "ObjEncuesta") ObjEncuesta objEncuesta ){
        
   
            if(  "123456".equals(session) && objEncuesta.getRut() != null  ){
                 
                
                return "Ingreso Correcto";}
            
            
            else{
                
                return "Error";
            }
    }
    
    @WebMethod(operationName = "limpiarCantidadCompra")
    public String limpiar (@WebParam(name = "session") String session ){
        
   
            if(  "123456".equals(session)  ){
             
                return "OK";
            }else
            {
            return "Error";
            }
             
    }
    
    @WebMethod(operationName = "envioEncuesta")
    public ObjEncuesta envioEncuesta (@WebParam(name = "session") String session , @WebParam(name = "ObjCliente") ObjCliente objcliente ){
        
   
            if(  "123456".equals(session)  ){
              ObjEncuesta objEncuesta =  new ObjEncuesta();
              ObjPregunta objPregunta =  new ObjPregunta();
              ObjRespuesta objRespuesta =  new ObjRespuesta();
               List<ObjRespuesta> lstOjRespuesta = new ArrayList<ObjRespuesta>();
               List<ObjPregunta> lstOjPregunta = new ArrayList<ObjPregunta>();
              objRespuesta.setNumero(1);
              objRespuesta.setFlagRespuesta(0);
              objRespuesta.setRespuesta("Si");
              lstOjRespuesta.add(objRespuesta);
               objRespuesta =  new ObjRespuesta();
              objRespuesta.setNumero(2);
              objRespuesta.setFlagRespuesta(0);
              objRespuesta.setRespuesta("No");
              lstOjRespuesta.add(objRespuesta);
              objRespuesta =  new ObjRespuesta();
                  objRespuesta.setNumero(3);
              objRespuesta.setFlagRespuesta(0);
              objRespuesta.setRespuesta("Puede Ser");
             lstOjRespuesta.add(objRespuesta);
              
             objPregunta.setNumero(1);
             objPregunta.setPregunta("¿ Le gusta nuestros productos ?");
             objPregunta.setObjRespuesta(lstOjRespuesta);
             objEncuesta.setNumero(1);
             objEncuesta.setRut(objcliente.getRut());
             lstOjPregunta.add(objPregunta);
             objEncuesta.setObjPregunta(lstOjPregunta);

 
              
              
                
                return objEncuesta;
            }else
            {
                
                
            return null;
            
            
            
            }
             
    }
    
    
    public static BufferedImage imageToBufferedImage(Image im) {
     java.awt.Image temp1=null; 
     BufferedImage image; 
        BufferedImage bi;
        temp1 = im.getScaledInstance(187, 72, java.awt.Image.SCALE_SMOOTH); 
        image = new BufferedImage(187, 72, BufferedImage.TYPE_INT_RGB); 
        bi = new BufferedImage
                (im.getWidth(null),im.getHeight(null),BufferedImage.TYPE_INT_RGB);
   // bi = resize(bi,184,72);
     Graphics bg = bi.getGraphics();
     Graphics bg2 = image.getGraphics();
     bg.drawImage(im, 0, 0, null);
     bg.dispose();
     bg2.drawImage(temp1, 0, 0, null);
     bg2.dispose();
     
    // WritableRaster raster = image.getRaster();
    //    DataBufferByte data   = (DataBufferByte) raster.getDataBuffer();
    //    byte[] imageBytes = data.getData();
     
     return image;
  }
     
    public static void writeImageToPNG (File file,BufferedImage bufferedImage)  throws IOException {
     ImageIO.write(bufferedImage,"png",file);
  }
}

