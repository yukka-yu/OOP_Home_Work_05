package home5;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import static home5.Config.pathLog;

public class FileWrite {
    FileWriter fileWriter;
    LocalDateTime now = LocalDateTime.now();

    public FileWrite() throws IOException {
        fileWriter = new FileWriter(pathLog, true);

    }

    public void write(String title) throws IOException {
        try {
            fileWriter.write(now + " : ");
            fileWriter.append(title);
            fileWriter.flush();
        } catch (IOException e) {
            System.out.println();
        }
    }
}

