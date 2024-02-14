package com.dailywork.lakeSidehotel.service;

import lombok.RequiredArgsConstructor;
import com.dailywork.lakeSidehotel.model.BookedRoom;
import com.dailywork.lakeSidehotel.model.BookedRoom;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
@RequiredArgsConstructor
public class BookingService implements IBookingService{
    private final BookingRepository bookingRepository;
    private final IRoomService roomService;
    @Override
    public List<BookedRoom> getAllBookings(){
        return bookingRepository.findAll();
    }
    @Override
    public List<BookedRoom> getBookingByUserEmail(String email){
        return bookingRepository.findByGuestEmail(email);
    }
    @Override
    public void cancelBooking(Long bookingId){
        bookingRepository.deleteById(bookingId);
    }
    @Override
    public List<BookedRoom> getAllBookingByRoomId(Long roomId){
        return bookingRepository.findByRoomId(roomId);
    }


}
