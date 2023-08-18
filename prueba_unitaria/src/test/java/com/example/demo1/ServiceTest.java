package com.example.demo1;

import org.junit.Test;
import static org.mockito.Mockito.*;

public class ServiceTest {
    @Test
    public void testSaveData() {
        // Crear un mock de la base de datos
        Database mockDatabase = mock(Database.class);

        // Configurar el comportamiento del mock
        when(mockDatabase.save(anyString())).thenReturn(true);

        // Usar el mock en el servicio
        Service service = new Service(mockDatabase);

        // Llamar al método que queremos probar
        boolean result = service.saveData("testData");

        // Verificar que el mock fue llamado correctamente
        verify(mockDatabase).save("testData");
        assert(result);
    }
}
