
package proyectolistadoble;

import javax.swing.JOptionPane;

public class ListaDoble 
{
   Nodo cab;
   Nodo ult;
   
   //Método constructor
   public ListaDoble()
   {
       cab=null;
       ult=null;
   }
   //metodo para mostrar
    public void mostrar() 
    {
        Nodo p = cab;
        String Salida = "";
        if (cab == null) 
        {
            JOptionPane.showMessageDialog(null, "lista vacia");
        } 
        else 
        {
            while (p != null) 
            {
                Salida = Salida + p.getDato() + "    ";
                p = p.getSig();
            }
            JOptionPane.showMessageDialog(null, "Datos de la lista: \n"+ Salida);
        }
      }
    
//metodo para insertar al inicio 
public void insertarInicio(int dato) 
{
    Nodo x = new Nodo(dato);
    if(cab==null)
    {
        cab=x;
        ult=x;
    }
    else
    {
        x.setSig(cab);
        cab.setAnt(x);
        cab=x;
    }
   }
  //metodo para insertar al final 
public void insertarFinal(int dato) 
{
    Nodo x = new Nodo(dato);
    if(cab==null)
    {
        cab=x;
        ult=x;
    }
    else
    {
        x.setAnt(ult);
        ult.setSig(x);
        ult=x;
    }
   }
      
  //metodo para eliminar un dato dado

    public void eliminardatodado(int dato) 
    {
        Nodo p = cab;
        boolean sw = false;
        if (cab == null) 
        {
            JOptionPane.showMessageDialog(null, "lista vacia");
        } 
        else 
        {
            while (p != null && sw == false) 
            {
                if (p.getDato() == dato) 
                {
                    sw = true;
                } 
                else 
                {
                    p = p.getSig();
                }
            }

        
        if (sw == false) 
        {
            JOptionPane.showMessageDialog(null, "el dato no existe");
        } 
        else
        {
            if(cab==ult)
            {
                cab=null;
                ult=null;
            }
            else
            {
                if(p==cab)
                {
                    cab=cab.getSig();
                    cab.setAnt(null);
                }
                else
                {
                    if(p==ult)
                    {
                        ult=ult.getAnt();
                        ult.setSig(null);
                    }
                    else
                    {
                        Nodo a, s;
                        a=p.getAnt();
                        s=p.getSig();
                        a.setSig(s);
                        s.setAnt(a);
                    }
                }
                
            }
         //delete(p)   
        }

    }
   }
}
