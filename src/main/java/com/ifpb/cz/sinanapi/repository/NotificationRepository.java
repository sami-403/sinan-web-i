package com.ifpb.cz.sinanapi.repository;

import com.ifpb.cz.sinanapi.model.entity.Notification;
import org.apache.juli.logging.Log;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {

}
