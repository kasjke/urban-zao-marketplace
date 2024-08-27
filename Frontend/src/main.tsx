import React from 'react';
import ReactDOM from 'react-dom/client';

import './assets/main.scss';
import { AppRoutes } from './routes/AppRouter';

const rootElement = document.getElementById('root');

// Типизация для rootElement
if (rootElement) {
  const root = ReactDOM.createRoot(rootElement);

  root.render(
    <React.StrictMode>
      <AppRoutes />
    </React.StrictMode>
  );
} else {
  // Обработка ошибки, если элемент root не найден
  console.error('Root element not found');
}
