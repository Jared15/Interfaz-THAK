package Conexion;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import Connection.RemoteObserver;


public interface RMI extends Remote{
	public String getPath(int carta) throws RemoteException;
	void addObserver(RemoteObserver o) throws RemoteException;
    void notificarActualizacion(String color) throws RemoteException;
    void crearJugador(String nombre, String pass,String PathAvatar) throws RemoteException;
    void eliminarJugador(String nombre) throws RemoteException;
    void actualizarJugador(String nombre, String pass,String PathAvatar) throws RemoteException;
    void addJugador(String nombreJugador) throws RemoteException;
    void getListaCartasMesa() throws RemoteException;
    boolean verificarJugador(String nombre, String pass) throws RemoteException;
    List<String> traerAvatar(String nombreUsuario) throws RemoteException;
    List<List<String>> getListaJugadores() throws RemoteException;
    void llenarMazo(int estilo) throws RemoteException;
    void mostrarPrimeras3() throws RemoteException;
    void mostrarCuarta() throws RemoteException;
    void mostrarQuinta()throws RemoteException;
    void siguienteRonda()throws RemoteException;
    void pasarTurno()throws RemoteException;
    void apostar(int idJugador,int dinero)throws RemoteException;
    void retirarse(int idJugador)throws RemoteException;
}
