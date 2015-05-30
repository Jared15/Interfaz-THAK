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
    void agregarApuesta(int jugador, int cantidad)throws RemoteException;
    void verificarApuestasRonda()throws RemoteException;
    void deleteObserver(RemoteObserver o)throws RemoteException;
    boolean esAdministrador(String nombreUsuario)throws RemoteException;
    void agregarNota(String nota,String usuario)throws RemoteException;
    List<List<String>> listaAdmin()throws RemoteException;
    void iniciarPartida()throws RemoteException;
    void actualizarLista()throws RemoteException;
    void registrarDenuncio(String jugador,String motivo,String descripcion)throws RemoteException;
    void bloquearJugador(String nombre)throws RemoteException;
    String getPass(String nombreUsuario)throws RemoteException;
    boolean isIniciada()throws RemoteException;
    void guardarColores(String fondo,int carta,String mesa,String usuario)throws RemoteException;
    double promedioGanadas()throws RemoteException;
    List<List<String>> getReportes()throws RemoteException;
	
}
