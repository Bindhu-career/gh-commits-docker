FROM node:10.16.3 as builder

COPY package.json ./

RUN npm i && mkdir /ng-app && mv ./node_modules ./ng-app

WORKDIR /ng-app

COPY . .

RUN npm install @angular/cli

RUN npm run ng build -- --prod --output-path=dist

FROM nginx

COPY /nginx /etc/nginx/conf.d/

RUN rm -rf /usr/share/nginx/html/*

COPY --from=builder /ng-app/dist /usr/share/nginx/html

CMD ["nginx", "-g", "daemon off;"]