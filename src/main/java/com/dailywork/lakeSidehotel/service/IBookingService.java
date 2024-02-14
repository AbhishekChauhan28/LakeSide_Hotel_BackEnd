package com.dailywork.lakeSidehotel.service;

import com.dailywork.lakeSidehotel.model.BookedRoom;

import java.awt.print.Book;
import java.util.List;

public interface IBookingService {
    void cancelBooking(Long bookingId);
    List<BookedRoom> getAllBookingsByRoomId(Long roomId);
    String saveBooking(Long roomId, BookedRoom bookingRequest);
    BookedRoom findBookingConfirmationCode(String confirmationCode);
    List<BookedRoom> getAllBookings();
    List<BookedRoom> getBookingsByUserEmail(String email);
}
