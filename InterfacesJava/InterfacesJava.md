## Interfaces Listener En java  

1- **INTERFACE** :ActionListener ; La interfaz de escucha para recibir eventos de acción.  
METODO : actionPerformed (ActionEvent)

2- **INTERFACE** : AdjustmentListener ; La interfaz de escucha para recibir eventos de ajuste.  
METODO : adjustmentValueChanged (AdjustmentEvent)

3- **INTERFACE** : ComponentListener ; La interfaz de escucha para recibir eventos de componentes.  
METODO : componentHidden (ComponentEvent)
componentMoved (ComponentEvent)
componentResized (ComponentEvent)
componentShown (ComponentEvent)

4- **INTERFACE** : ContainerListener ; La interfaz de escucha para recibir eventos de contenedores.  
METODO : ComponentAdded (ComponentEvent)
ComponentRemoved (ComponentEvent)

5- **INTERFACE** : FocusListener ; La interfaz de escucha para recibir eventos de teclado se centran en un componente.  
METODO : focusGained (FocusEvent)
focusLost (FocusEvent)

6- **INTERFACE** : ItemListener ; La interfaz de escucha para recibir eventos de elemento.  
METODO : itemStateChanged (ItemEvent)


7- **INTERFACE** : KeyListener ; La interfaz de escucha para recibir eventos de teclado (combinaciones de teclas).  
METODO : keyPressed (KeyEvent)
keyReleased (KeyEvent)
keyTyped (KeyEvent)

8- **INTERFACE** : MouseListener ; La interfaz de receptor para la recepción de "interesantes" eventos del ratón en un componente.  
METODO : mouseClicked (MouseEvent)
mouseEntered (MouseEvent)
mouseExited (MouseEvent)
mousePressed (MouseEvent)
mouseReleased (MouseEvent)

9- **INTERFACE** : MouseMotionListener ; La interfaz de escucha para recibir eventos de ratón en movimiento en un componente.  
METODO : mouseDragged (MouseEvent)
mouseMoved (MouseEvent)

10- **INTERFACE** : Texto: Oyente  
METODO : textValueChanged (TextEvent)

11- **INTERFACE** : WindowListener ; La interfaz de escucha para recibir eventos de ventana.  
METODO : windowActivated (WindowEvent)  
windowClosed (WindowEvent)  
windowClosing (WindowEvent)  
windowDeactivated (WindowEvent)  
windowDeiconified (WindowEvent)  
windowIconified (WindowEvent)  
windowOpened (WindowEvent)