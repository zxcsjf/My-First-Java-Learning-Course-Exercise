package com.Mytube;

// Tightly Coupling with 3 Class
// Talk to Interface
public class VideoProcessor {
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    // Constructor Injection
    public VideoProcessor(VideoEncoder encoder,
                          VideoDatabase database,
                          NotificationService notificationService) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = notificationService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }
}

