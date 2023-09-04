DESCRIPTION = "Arcadia packagegroups"

inherit packagegroup

PACKAGES = " \
  ${PN}-core \
  ${PN}-networking \
  ${PN}-devtools "

RDEPENDS:${PN}-core = " \
  libgbm \
  systemd \
  shadow \
  bash \
  bash-completion \
  coreutils \
  inetutils \
  iputils \
  procps \
  util-linux \
  net-tools "


RDEPENDS:${PN}-networking = " \
  dhcpcd \
  wpa-supplicant \
  wpa-supplicant-passphrase \
  wpa-supplicant-cli \
  wpa-supplicant-plugins \
  wireless-init \
  iw \
  linux-firmware \
  linux-firmware-rt2870 \
  openssh \
  openssh-sftp \
  openssh-sftp-server "

RDEPENDS:${PN}-devtools = " \
  kmscube \
  vim \
  vim-syntax \
  vim-help \
  vim-tutor \
  vim-vimrc \
  vim-common \
  ldd \
  htop \
  python3 \
  python3-pip \
  python3-six \
  lldb \
  lldb-server "
