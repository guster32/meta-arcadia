DESCRIPTION = "Arcadia packagegroups"

inherit packagegroup

PACKAGES = " \
  ${PN}-core \
  ${PN}-networking \
  ${PN}-emulators \
  ${PN}-graphics \
  ${PN}-devtools "

RDEPENDS:${PN}-core = " \
  systemd \
  shadow \
  bash \
  bash-completion \
  coreutils \
  procps \
  util-linux \
  alsa-utils \
  pulseaudio \
  pulseaudio-misc \
  pulseaudio-server \
  pulseaudio-module-dbus-protocol \
  "

RDEPENDS:${PN}-graphics = " \
	libdisplay-info \
	seatd \
  wlroots \
	wayland \
  weston \
	wayland-protocols "


RDEPENDS:${PN}-networking = " \
  net-tools \
  inetutils \
  iputils \
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

RDEPENDS:${PN}-emulators = " \
  mamedev \
"

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
  lldb-server \
  rust \
  rust-dev "
