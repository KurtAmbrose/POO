# Makefile para compilar un archivo Java

# Nombre del archivo Java sin la extensión
SOURCE_FILE = holaMundo.java

# Nombre del archivo de clase generado por el compilador
CLASS_FILE = $(SOURCE_FILE).class

# Comando para compilar el archivo Java
JAVAC = javac

# Regla por defecto: compilar el archivo Java
all: $(CLASS_FILE)

# Regla para compilar el archivo Java
$(CLASS_FILE): $(SOURCE_FILE).java
    $(JAVAC) $<

# Regla para limpiar los archivos generados
clean:
    rm -f $(CLASS_FILE)