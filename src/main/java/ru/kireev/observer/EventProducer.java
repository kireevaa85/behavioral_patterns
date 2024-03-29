package ru.kireev.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sergey
 * created on 11.09.18.
 */
class EventProducer {

  private final List<Listener> listeners = new ArrayList<>();

  void addListener(Listener listener) {
    listeners.add(listener);
  }

  void removeListener(Listener listener) {
    listeners.remove(listener);
  }

  void event(String data) {
    listeners.forEach(listener -> listener.onUpdate(data));
  }
}
